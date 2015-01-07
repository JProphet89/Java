package source;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextArea;

public class Ontologies{
    public ArrayList<Concepts> concept;
    public ArrayList<Hierarchies> hierarchy;
    public ArrayList<Relations> relation;
    public ArrayList<Triples> triple;

    public Ontologies(){
        this.concept=new ArrayList<Concepts>();
        this.hierarchy=new ArrayList<Hierarchies>();
        this.relation=new ArrayList<Relations>();
        this.triple=new ArrayList<Triples>();
    }
    public void gerarowl(String input, JTextArea jTextArea1) throws FileNotFoundException {
        jTextArea1.setText(jTextArea1.getText()+"\nStarting...");
        String owl=""+
        "<?xml version=\"1.0\"?>\n" +
        "<!DOCTYPE Ontology [\n" +
        "    <!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\" >\n" +
        "    <!ENTITY xml \"http://www.w3.org/XML/1998/namespace\" >\n" +
        "    <!ENTITY rdfs \"http://www.w3.org/2000/01/rdf-schema#\" >\n" +
        "    <!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" >\n" +
        "]>\n" +
        "<Ontology xmlns=\"http://www.w3.org/2002/07/owl#\"\n" +
        "     xml:base=\"http://www.semanticweb.org/jprophet89/ontologies/2013/11/"+input+"\"\n" +
        "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" +
        "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n" +
        "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" +
        "     xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"\n" +
        "     ontologyIRI=\"http://www.semanticweb.org/jprophet89/ontologies/2013/11/"+input+"\">\n" +
        "    <Prefix name=\"rdf\" IRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/>\n" +
        "    <Prefix name=\"rdfs\" IRI=\"http://www.w3.org/2000/01/rdf-schema#\"/>\n" +
        "    <Prefix name=\"xsd\" IRI=\"http://www.w3.org/2001/XMLSchema#\"/>\n" +
        "    <Prefix name=\"owl\" IRI=\"http://www.w3.org/2002/07/owl#\"/>";
        jTextArea1.setText(jTextArea1.getText()+"\n20%");
        Iterator conceitos1=this.concept.iterator();
        ArrayList<Atributes> all=new ArrayList<Atributes>();
        while(conceitos1.hasNext()){
            Concepts ctmp=(Concepts)conceitos1.next();
            owl+=""+
            "    <Declaration>\n" +
            "        <Class IRI=\"#"+ctmp.name+"\"/>\n" +
            "    </Declaration>\n";
            all.addAll(ctmp.atribute);
        }
        jTextArea1.setText(jTextArea1.getText()+"\n30%");
        Iterator relacoes1=this.relation.iterator();
        while(relacoes1.hasNext()){
            Relations rtmp=(Relations)relacoes1.next();
            owl+=""+
            "    <Declaration>\n" +
            "        <ObjectProperty IRI=\"#"+rtmp.name+"\"/>\n" +
            "    </Declaration>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\n40%");
        Iterator atributos1=all.iterator();
        while(atributos1.hasNext()){
            Atributes atmp=(Atributes)atributos1.next();
            owl+=""+
            "    <Declaration>\n" +
            "        <DataProperty IRI=\"#"+atmp.name+"\"/>\n" +
            "    </Declaration>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\n50%");
        Iterator subclass1=this.hierarchy.iterator();
        while(subclass1.hasNext()){
            Hierarchies htmp=(Hierarchies)subclass1.next();
            owl+=""+
            "    <SubClassOf>\n" +
            "        <Class IRI=\"#"+htmp.subclass_name+"\"/>\n" +
            "        <Class IRI=\"#"+htmp.class_name+"\"/>\n" +
            "    </SubClassOf>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\n60%");
        Iterator link1=this.triple.iterator();
        while(link1.hasNext()){
            Triples ttmp=(Triples)link1.next();
            owl+=""+
            "    <ObjectPropertyDomain>\n" +
            "        <ObjectProperty IRI=\"#"+ttmp.relation+"\"/>\n" +
            "        <Class IRI=\"#"+ttmp.class1+"\"/>\n" +
            "    </ObjectPropertyDomain>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\n70%");
        Iterator link2=this.triple.iterator();
        while(link2.hasNext()){
            Triples ttmp1=(Triples)link2.next();
            if(ttmp1.max<1 && ttmp1.min<1){
                owl+=""+
                        "    <ObjectPropertyRange>\n" +
                        "        <Annotation>\n" +
                        "            <AnnotationProperty abbreviatedIRI=\"owl:backwardCompatibleWith\"/>\n" +
                        "            <IRI>#"+ttmp1.class1+"</IRI>\n" +
                        "        </Annotation>\n" +
                        "        <ObjectProperty IRI=\"#"+ttmp1.relation+"\"/>\n" +
                        "        <Class IRI=\"#"+ttmp1.class2+"\"/>\n" +
                        "    </ObjectPropertyRange>\n";
            }else{
                if(ttmp1.max>=1){
                    owl+="" +
                        "    <ObjectPropertyRange>\n" +
                            "        <Annotation>\n" +
                            "            <AnnotationProperty abbreviatedIRI=\"owl:backwardCompatibleWith\"/>\n" +
                            "            <IRI>#"+ttmp1.class1+"</IRI>\n" +
                            "        </Annotation>\n" +
                        "        <ObjectProperty IRI=\"#"+ttmp1.relation+"\"/>\n" +
                        "        <ObjectMaxCardinality cardinality=\""+ttmp1.max+"\">\n" +
                        "            <ObjectProperty IRI=\"#"+ttmp1.relation+"\"/>\n" +
                        "            <Class IRI=\"#"+ttmp1.class2+"\"/>\n" +
                        "        </ObjectMaxCardinality>\n" +
                        "    </ObjectPropertyRange>";
                }
                if(ttmp1.min>=1){
                    owl+="" +
                            "    <ObjectPropertyRange>\n" +
                            "        <Annotation>\n" +
                            "            <AnnotationProperty abbreviatedIRI=\"owl:backwardCompatibleWith\"/>\n" +
                            "            <IRI>#"+ttmp1.class1+"</IRI>\n" +
                            "        </Annotation>\n" +
                            "        <ObjectProperty IRI=\"#"+ttmp1.relation+"\"/>\n" +
                            "        <ObjectMinCardinality cardinality=\""+ttmp1.min+"\">\n" +
                            "            <ObjectProperty IRI=\"#"+ttmp1.relation+"\"/>\n" +
                            "            <Class IRI=\"#"+ttmp1.class2+"\"/>\n" +
                            "        </ObjectMinCardinality>\n" +
                            "    </ObjectPropertyRange>";
                }
            }
        }
        jTextArea1.setText(jTextArea1.getText()+"\n80%");
        Iterator atributos2=this.concept.iterator();
        while(atributos2.hasNext()){
            Concepts ctmp1=(Concepts)atributos2.next();
            Iterator lista1=ctmp1.atribute.iterator();
            while(lista1.hasNext()){
                Atributes a1=(Atributes)lista1.next();
                owl+=""+
                "    <DataPropertyDomain>\n" +
                "        <DataProperty IRI=\"#"+a1.name+"\"/>\n" +
                "        <Class IRI=\"#"+ctmp1.name+"\"/>\n" +
                "    </DataPropertyDomain>";
            }
        }
        jTextArea1.setText(jTextArea1.getText()+"\n85%");
        Iterator atributos3=this.concept.iterator();
        while(atributos3.hasNext()){
            Concepts ctmp2=(Concepts)atributos3.next();
            Iterator lista2=ctmp2.atribute.iterator();
            while(lista2.hasNext()){
                Atributes a2=(Atributes)lista2.next();
                owl+=""+
                "    <DataPropertyRange>\n" +
                "        <DataProperty IRI=\"#"+a2.name+"\"/>\n" +
                "        <Datatype abbreviatedIRI=\"xsd:"+a2.type+"\"/>\n" +
                "    </DataPropertyRange>";
            }
        }
        jTextArea1.setText(jTextArea1.getText()+"\n90%");
        Iterator conceitos2=this.concept.iterator();
        while(conceitos2.hasNext()){
            Concepts ttmp=(Concepts)conceitos2.next();
            if(ttmp.description!=null){
                owl+=""+
                "    <AnnotationAssertion>\n" +
                "        <AnnotationProperty abbreviatedIRI=\"rdfs:comment\"/>\n" +
                "        <IRI>#"+ttmp.name+"</IRI>\n" +
                "        <Literal datatypeIRI=\"&rdf;PlainLiteral\">\n" +
                            ttmp.description +
                "        </Literal>\n" +
                "    </AnnotationAssertion>";
            }
        }
        jTextArea1.setText(jTextArea1.getText()+"\n95%");
        Iterator relacoes2=this.relation.iterator();
        while(relacoes2.hasNext()){
            Relations rtmp1=(Relations)relacoes2.next();
            if(rtmp1.description!=null){
                owl+=""+
                "    <AnnotationAssertion>\n" +
                "        <AnnotationProperty abbreviatedIRI=\"rdfs:comment\"/>\n" +
                "        <IRI>#"+rtmp1.name+"</IRI>\n" +
                "        <Literal datatypeIRI=\"&rdf;PlainLiteral\">\n" +
                            rtmp1.description +
                "        </Literal>\n" +
                "    </AnnotationAssertion>";
            }
        }
        owl+="</Ontology>";
        jTextArea1.setText(jTextArea1.getText()+"\n100% Done processing metadata...\nCreating file...\n");
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream(input+".owl"));
            out.print(owl);
        }
        finally {
            if (out != null) out.close();
        }
        jTextArea1.setText(jTextArea1.getText()+"\nDone...Check your "+input+".owl file");
    }
}