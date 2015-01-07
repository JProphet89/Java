package RDF;

import OWL.Ontology;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jprophet89 on 01/03/14.
 */

public class RDF {

    public Ontology_RDF onto;

    public Ontology RDFparser(File file,JTextArea textarea,JProgressBar progressbar) throws DocumentException {
        File xml = file;
        SAXReader reader = new SAXReader();
        Document doc = reader.read(xml);
        Element root = doc.getRootElement();
        this.onto=new Ontology_RDF();
        progressbar.setMaximum(100);
        progressbar.setMinimum(0);
        /**
         *
         * Get all ObjectProperty
         **/
        for(Iterator<Element> i=root.elements("ObjectProperty").iterator();i.hasNext();){
            Element tempclass= i.next();
            ArrayList<String> domain=new ArrayList<>();
            String range;
            String relation;
            int cardy=-1;
            relation=tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#")+1);
            for(Iterator<Element> dom=tempclass.elements("domain").iterator();dom.hasNext();){
                Element temp=dom.next();
                domain.add(temp.attributeValue("resource").substring(temp.attributeValue("resource").indexOf("#") + 1));
            }
            for(Iterator<Element> ran=tempclass.elements("range").iterator();ran.hasNext();){
                Element rantemp=ran.next();
                if(rantemp.elements("Restriction").isEmpty()){
                    range=tempclass.element("range").attributeValue("resource").substring(tempclass.element("range").attributeValue("resource").indexOf("#")+1);
                    cardy=-1;
                    this.onto.add_ObjectProperty(relation,domain,range,cardy,cardy);
                }else{
                    if(!rantemp.element("Restriction").elements("maxQualifiedCardinality").isEmpty()){
                        range=rantemp.element("Restriction").element("onClass").attributeValue("resource").substring(rantemp.element("Restriction").element("onClass").attributeValue("resource").indexOf("#")+1);
                        cardy=Integer.parseInt(rantemp.element("Restriction").elementText("maxQualifiedCardinality"));
                        this.onto.add_ObjectProperty(relation,domain,range,cardy,-1);
                    }
                    if(!rantemp.element("Restriction").elements("minQualifiedCardinality").isEmpty()){
                        range=rantemp.element("Restriction").element("onClass").attributeValue("resource").substring(rantemp.element("Restriction").element("onClass").attributeValue("resource").indexOf("#")+1);
                        cardy=Integer.parseInt(rantemp.element("Restriction").elementText("minQualifiedCardinality"));
                        this.onto.add_ObjectProperty(relation,domain,range,-1,cardy);
                    }
                }
                textarea.setText(textarea.getText()+"\nAdd New object property::"+tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#")+1)+" with cardinality>"+cardy);
            }

        }
        progressbar.setValue(35);
        /**
         * Get all the DatatypeProperty
         **/
        for(Iterator i=root.elements("DatatypeProperty").iterator();i.hasNext();){
            Element tempclass=(Element) i.next();
            if(tempclass.element("range")!=null && tempclass.element("domain")!=null){
                this.onto.add_DatatypeProperty(
                        tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                        tempclass.element("range").attributeValue("resource").substring(tempclass.element("range").attributeValue("resource").indexOf("#") + 1),
                        tempclass.element("domain").attributeValue("resource").substring(tempclass.element("domain").attributeValue("resource").indexOf("#") + 1)
                );
            }
            textarea.setText(textarea.getText()+"\nAdd New data property::"+tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#")+1));
        }
        progressbar.setValue(65);
        /**
         * Get all the Classes
         **/
        for(Iterator i=root.elements("Class").iterator();i.hasNext();){
            Element tempclass=(Element) i.next();
            if(!tempclass.elements("subClassOf").isEmpty()){
                for(Iterator k=tempclass.elements("subClassOf").iterator();k.hasNext();){
                    Element temp1=(Element)k.next();
                    if(temp1.attributeValue("resource")!=null){
                        this.onto.add_Classes(
                                tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                                temp1.attributeValue("resource").substring(temp1.attributeValue("resource").indexOf("#") + 1)
                        );
                    }
                }
                textarea.setText(textarea.getText()+"\nAdd New Class::"+tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#")+1));
            }else{
                if(!tempclass.elements("equivalentClass").isEmpty()){
                    this.onto.add_Classes(
                            tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                            tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").substring(tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").indexOf("#")+1)

                    );
                    textarea.setText(textarea.getText()+"\nAdd New Class::"+tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").substring(tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").indexOf("#")+1));
                }else{
                    this.onto.add_Classes(
                            tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                            "Thing"
                    );
                }
            }
        }
        if(root.elements("Axiom")!=null){
            for(Iterator<Element> anno=root.elements("Axiom").iterator();anno.hasNext();){
                Element ano=anno.next();
                String range,relation;
                String domain=ano.element("backwardCompatibleWith").attributeValue("resource").substring(ano.element("backwardCompatibleWith").attributeValue("resource").indexOf("#")+1);
                if(ano.element("annotatedTarget").elements("Restriction").isEmpty()){
                    range=ano.element("annotatedTarget").attributeValue("resource").substring(ano.element("annotatedTarget").attributeValue("resource").indexOf("#")+1);
                }else{
                    range=ano.element("annotatedTarget").element("Restriction").element("onClass").attributeValue("resource").substring(ano.element("annotatedTarget").element("Restriction").element("onClass").attributeValue("resource").indexOf("#")+1);
                }
                relation=ano.element("annotatedSource").attributeValue("resource").substring(ano.element("annotatedSource").attributeValue("resource").indexOf("#")+1);
                this.onto.add_triplerestriction(domain,relation,range);
            }
        }
        progressbar.setValue(80);
        textarea.setText(textarea.getText()+"\n\nStatistics----\n\nClass found: "+this.onto.classes.size());
        textarea.setText(textarea.getText()+"\nObjectProperty found: "+this.onto.objectprop.size());
        textarea.setText(textarea.getText()+"\nDataProperty found: "+this.onto.dataprop.size());
        progressbar.setValue(100);
        this.onto.organize_objpro_anota();

        return converter();
    }



    public Ontology_RDF RDFparser2(File file,JTextArea textarea,JProgressBar progressbar) throws DocumentException {
        File xml = file;
        SAXReader reader = new SAXReader();
        Document doc = reader.read(xml);
        Element root = doc.getRootElement();
        this.onto=new Ontology_RDF();
        progressbar.setMaximum(100);
        progressbar.setMinimum(0);
        /**
         *
         * Get all ObjectProperty
         **/
        for(Iterator<Element> i=root.elements("ObjectProperty").iterator();i.hasNext();){
            Element tempclass= i.next();
            ArrayList<String> domain=new ArrayList<>();
            String range;
            String relation;
            int cardy;
            relation=tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf(";")+1);
            for(Iterator<Element> dom=tempclass.elements("domain").iterator();dom.hasNext();){
                Element temp=dom.next();
                domain.add(temp.attributeValue("resource").substring(temp.attributeValue("resource").indexOf("#") + 1));
            }
            for(Iterator<Element> ran=tempclass.elements("range").iterator();ran.hasNext();){
                Element rantemp=ran.next();
                if(rantemp.element("Restriction").element("maxQualifiedCardinality")!=null){
                    range=rantemp.element("Restriction").element("onClass").attributeValue("resource").substring(tempclass.element("Restriction").element("onClass").attributeValue("resource").indexOf("#")+1);
                    cardy=Integer.parseInt(rantemp.element("Restriction").elementText("maxQualifiedCardinality"));
                    this.onto.add_ObjectProperty(relation,domain,range,cardy,-1);
                }
                if(rantemp.element("Restriction").element("minQualifiedCardinality")!=null){
                    range=rantemp.element("Restriction").element("onClass").attributeValue("resource").substring(tempclass.element("Restriction").element("onClass").attributeValue("resource").indexOf("#")+1);
                    cardy=Integer.parseInt(rantemp.element("Restriction").elementText("minQualifiedCardinality"));
                    this.onto.add_ObjectProperty(relation,domain,range,-1,cardy);
                }else{
                    range=tempclass.element("range").attributeValue("resource").substring(tempclass.element("range").attributeValue("resource").indexOf("#")+1);
                    cardy=0;
                    this.onto.add_ObjectProperty(relation,domain,range,cardy,cardy);
                }
                textarea.setText(textarea.getText()+"\nAdd New object property::"+tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#")+1)+" with cardinality>"+cardy);
            }

        }

        progressbar.setValue(35);
        /**
         * Get all the DatatypeProperty
         **/
        for(Iterator i=root.elements("DatatypeProperty").iterator();i.hasNext();){
            Element tempclass=(Element) i.next();
            if(tempclass.element("range")!=null && tempclass.element("domain")!=null){
                this.onto.add_DatatypeProperty(
                        tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                        tempclass.element("range").attributeValue("resource").substring(tempclass.element("range").attributeValue("resource").indexOf("#") + 1),
                        tempclass.element("domain").attributeValue("resource").substring(tempclass.element("domain").attributeValue("resource").indexOf("#") + 1)
                );
            }
            textarea.setText(textarea.getText()+"\nAdd New data property::"+tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#")+1));
        }
        progressbar.setValue(65);
        /**
         * Get all the Classes
         **/
        for(Iterator i=root.elements("Class").iterator();i.hasNext();){
            Element tempclass=(Element) i.next();
            if(!tempclass.elements("subClassOf").isEmpty()){
                for(Iterator k=tempclass.elements("subClassOf").iterator();k.hasNext();){
                    Element temp1=(Element)k.next();
                    if(temp1.attributeValue("resource")!=null){
                        this.onto.add_Classes(
                                tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                                temp1.attributeValue("resource").substring(temp1.attributeValue("resource").indexOf("#") + 1)
                        );
                    }
                }
                textarea.setText(textarea.getText()+"\nAdd New Class::"+tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#")+1));
            }else{
                if(!tempclass.elements("equivalentClass").isEmpty()){
                    this.onto.add_Classes(
                            tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                            tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").substring(tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").indexOf("#")+1)

                    );
                    textarea.setText(textarea.getText()+"\nAdd New Class::"+tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").substring(tempclass.element("equivalentClass").element("Class").element("intersectionOf").element("Description").attributeValue("about").indexOf("#")+1));
                }else{
                    this.onto.add_Classes(
                            tempclass.attributeValue("about").substring(tempclass.attributeValue("about").indexOf("#") + 1),
                            "Thing"
                    );
                }
            }
        }
        if(root.elements("Axiom")!=null){
            for(Iterator<Element> anno=root.elements("Axiom").iterator();anno.hasNext();){
                Element ano=anno.next();
                String domain=ano.element("backwardCompatibleWith").attributeValue("resource").substring(ano.element("backwardCompatibleWith").attributeValue("resource").indexOf("#")+1);
                String relation=ano.element("annotatedSource").attributeValue("resource").substring(ano.element("annotatedSource").attributeValue("resource").indexOf("#")+1);
                String range=ano.element("annotatedTarget").attributeValue("resource").substring(ano.element("annotatedTarget").attributeValue("resource").indexOf("#")+1);
                this.onto.add_triplerestriction(domain,relation,range);
            }
        }
        progressbar.setValue(80);
        textarea.setText(textarea.getText()+"\n\nStatistics----\n\nClass found: "+this.onto.classes.size());
        textarea.setText(textarea.getText()+"\nObjectProperty found: "+this.onto.objectprop.size());
        textarea.setText(textarea.getText()+"\nDataProperty found: "+this.onto.dataprop.size());
        progressbar.setValue(100);
        return this.onto;
    }


    private Ontology converter() {
        Ontology finalontology=new Ontology();
        /**
         * Create all Concepts
         * */
        for(Iterator i=this.onto.classes.iterator();i.hasNext();){
            Classes temp=(Classes)i.next();
            finalontology.addConcept(temp.name,temp.triples);
        }

        /**
         * Create all Hierarchies
         ***/
        for(Iterator i=this.onto.classes.iterator();i.hasNext();){
            Classes temp=(Classes)i.next();
            if(!temp.upclasses.equals("Thing")){
                finalontology.addHierarchy(temp.upclasses,temp.name);
            }
        }

        /**
         * Create all Data_properties
         **/
        for(Iterator i=this.onto.dataprop.iterator();i.hasNext();){
            DataProperty temp=(DataProperty)i.next();
            finalontology.addAttribute(temp.domain,temp.name,temp.type);
        }

        /**
         * Create all Object_properties
         */
        for(Iterator i=this.onto.objectprop.iterator();i.hasNext();){
            ObjectProperty temp=(ObjectProperty)i.next();
            finalontology.addPropertyRange(temp.range,temp.relation, temp.max,temp.min);
        }


        return finalontology;
    }

}
