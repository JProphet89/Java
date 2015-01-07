/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OWL;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * @author jprophet89
 */
public class OWL {

    public Ontology OWlparser(File file,JTextArea jTextField1,JProgressBar progressbar) throws DocumentException{
        Ontology onto=new Ontology();
        String temp="";
        File xml = file;
        SAXReader reader = new SAXReader();
        Document doc = reader.read(xml);
        Element root = doc.getRootElement();
        progressbar.setMinimum(0);
        progressbar.setMaximum(100);
        for ( Iterator i = root.elementIterator( "Declaration" ); i.hasNext(); ) {
            Element foo = (Element) i.next();
            if(foo.element("Class")!=null){
                if (foo.element("Class").attributeValue("IRI")!=null){
                    temp=foo.element("Class").attributeValue("IRI").substring(foo.element("Class").attributeValue("IRI").indexOf("#")+1);
                }else{
                    temp=foo.element("Class").attributeValue("abbreviatedIRI").substring(foo.element("Class").attributeValue("abbreviatedIRI").indexOf("#")+1);
                }
                onto.addConcept(temp);
                jTextField1.setText(jTextField1.getText()+"\nConcept added::"+temp);
            }
        }
        progressbar.setValue(25);
        for ( Iterator i = root.elementIterator( "SubClassOf" ); i.hasNext(); ) {
            Element foo = (Element) i.next();
            List<Element> list=foo.elements("Class");
            //The normal hierarchy
            if(list.size()>1){
                String class1=null,class2=null;
                if(list.get(1).attributeValue("IRI")!=null){
                    temp=list.get(1).attributeValue("IRI").substring(list.get(1).attributeValue("IRI").indexOf("#")+1);
                }else{
                    temp=list.get(1).attributeValue("abbreviatedIRI").substring(list.get(1).attributeValue("abbreviatedIRI").indexOf("#")+1);
                }
                class1=temp;
                if(list.get(0).attributeValue("IRI")!=null){
                    temp=list.get(0).attributeValue("IRI").substring(list.get(0).attributeValue("IRI").indexOf("#")+1);
                }else{
                    temp=list.get(0).attributeValue("abbreviatedIRI").substring(list.get(0).attributeValue("abbreviatedIRI").indexOf("#")+1);
                }
                class2=temp;
                onto.addHierarchy(class1,class2);
                jTextField1.setText(jTextField1.getText()+"\nHierarcy added::"+class1+">"+class2);
            }
        }
        progressbar.setValue(50);
        for ( Iterator i = root.elementIterator( "ObjectPropertyDomain" ); i.hasNext(); ) {
            String domain=null,relation=null;
            Element foo = (Element) i.next();
            relation=foo.element("ObjectProperty").attributeValue("IRI");
            relation=relation.substring(relation.indexOf("#")+1);
            domain=foo.element("Class").attributeValue("IRI");
            domain=domain.substring(domain.indexOf("#")+1);
            onto.addPropertyDomain(domain,relation);
            jTextField1.setText(jTextField1.getText()+"\nObjectPropertyDomain added::"+domain+"<>"+relation);
        }
        progressbar.setValue(75);
        for ( Iterator i = root.elementIterator( "ObjectPropertyRange" ); i.hasNext(); ) {
            String range=null,relation=null;
            int cardi;
            ArrayList<String> lstconcept=new ArrayList<>();
            Element foo = (Element) i.next();
            if(foo.elements("Annotation")!=null){
                for(Iterator<Element> anno=foo.elements("Annotation").iterator();anno.hasNext();){
                    Element ano=anno.next();
                    lstconcept.add(ano.elementText("IRI").substring(ano.elementText("IRI").indexOf("#")+1));
                }
            }
            if(foo.element("ObjectMaxCardinality")!=null){
                cardi=Integer.parseInt(foo.element("ObjectMaxCardinality").attributeValue("cardinality"));
                relation=foo.element("ObjectMaxCardinality").element("ObjectProperty").attributeValue("IRI");
                relation=relation.substring(relation.indexOf("#")+1);
                range=foo.element("ObjectMaxCardinality").element("Class").attributeValue("IRI");
                range=range.substring(range.indexOf("#")+1);
                onto.addPropertyRange(range,relation,cardi,-1,lstconcept);
                jTextField1.setText(jTextField1.getText()+"\nObjectPropertyRange added::"+range+"<>"+relation+" with carinality="+cardi+" with the concept domain of "+lstconcept.toString());
            }else{
                if(foo.element("ObjectMinCardinality")!=null){
                    cardi=Integer.parseInt(foo.element("ObjectMinCardinality").attributeValue("cardinality"));
                    relation=foo.element("ObjectMinCardinality").element("ObjectProperty").attributeValue("IRI");
                    relation=relation.substring(relation.indexOf("#")+1);
                    range=foo.element("ObjectMinCardinality").element("Class").attributeValue("IRI");
                    range=range.substring(range.indexOf("#")+1);
                    onto.addPropertyRange(range,relation,-1,cardi,lstconcept);
                    jTextField1.setText(jTextField1.getText()+"\nObjectPropertyRange added::"+range+"<>"+relation+" with carinality="+cardi+" with the concept domain of "+lstconcept.toString());
                }else{
                    relation=foo.element("ObjectProperty").attributeValue("IRI");
                    relation=relation.substring(relation.indexOf("#")+1);
                    range=foo.element("Class").attributeValue("IRI");
                    range=range.substring(range.indexOf("#")+1);
                    onto.addPropertyRange(range,relation,-1,-1,lstconcept);
                    jTextField1.setText(jTextField1.getText()+"\nObjectPropertyRange added::"+range+"<>"+relation+" with the concept domain of "+lstconcept.toString());
                }
            }

        }
        progressbar.setValue(85);
        for ( Iterator i = root.elementIterator( "DataPropertyDomain" ); i.hasNext(); ) {
            String classe=null,attribute=null,type=null;
            Element foo = (Element) i.next();
            classe=foo.element("Class").attributeValue("IRI");
            classe=classe.substring(classe.indexOf("#")+1);
            attribute=foo.element("DataProperty").attributeValue("IRI");
            attribute=attribute.substring(attribute.indexOf("#")+1);
            for ( Iterator j = root.elementIterator( "DataPropertyRange" ); j.hasNext(); ) {
                Element bar=(Element)j.next();
                if(bar.element("DataProperty").attributeValue("IRI").substring(bar.element("DataProperty").attributeValue("IRI").indexOf("#")+1).equals(attribute)){
                    if(bar.element("Datatype").attributeValue("abbreviatedIRI")!=null){
                        type=bar.element("Datatype").attributeValue("abbreviatedIRI").substring(bar.element("Datatype").attributeValue("abbreviatedIRI").indexOf("xsd:")+1);
                    }else{
                        type=bar.element("Datatype").attributeValue("IRI");
                    }

                }
            }
            if(classe!=null && attribute!=null && type!=null){
                onto.addAttribute(classe,attribute,type);
                jTextField1.setText(jTextField1.getText()+"\nAttributed::"+attribute+"<is>"+type+"<added to>"+classe);
            }
        }
        progressbar.setValue(95);
        for ( Iterator i = root.elementIterator( "AnnotationAssertion" ); i.hasNext(); ) {
            Element foo=(Element) i.next();
            String classe,annotation;
            classe=foo.elementText("IRI").substring(foo.elementText("IRI").indexOf("#")+1);
            annotation=foo.elementText("Literal");
            onto.addAnnotation(classe,annotation);

        }

        onto.Delete_replic();
        onto.processRange();
        progressbar.setValue(100);
        //Statistic
        jTextField1.setText(jTextField1.getText()+
                "\n\nStatistic::\nConcepts found="+onto.concepts.size()+
                "\nHierarchies found="+onto.hierarcy.size()+
                "\nObjectPropertyDomain found="+onto.tripledomain.size()+
                "\nObjectPropertyRange found="+onto.triplerange.size());
        return onto;
    }

}
