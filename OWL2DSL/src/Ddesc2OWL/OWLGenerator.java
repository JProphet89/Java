package Ddesc2OWL;

import OWL.*;
import OWL.Concepts;
import OWL.Hierarchies;
import RDF.Classes;
import RDF.DataProperty;
import RDF.ObjectProperty;
import RDF.Ontology_RDF;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import source.*;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jprophet89 on 16/04/14.
 */
public class OWLGenerator {

    public void generateOWL(Ontology ontology, String iri, String name, JTextArea jTextArea1) throws IOException, ParseException {
        jTextArea1.setText(jTextArea1.getText()+"\nStarting the new Ontology generation!");
        String finalontologyfile="" +
                "<?xml version=\"1.0\"?>\n" +
                "\n" +
                "\n" +
                "<!DOCTYPE Ontology [\n" +
                "    <!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\" >\n" +
                "    <!ENTITY xml \"http://www.w3.org/XML/1998/namespace\" >\n" +
                "    <!ENTITY rdfs \"http://www.w3.org/2000/01/rdf-schema#\" >\n" +
                "    <!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" >\n" +
                "    <!ENTITY "+name+" \""+iri+"#\" >" +
                "]>\n" +
                "\n" +
                "\n" +
                "<Ontology xmlns=\"http://www.w3.org/2002/07/owl#\"\n" +
                "     xml:base=\""+iri+"\"\n" +
                "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" +
                "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n" +
                "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" +
                "     xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"\n" +
                "     ontologyIRI=\""+iri+"\">\n" +
                "    <Prefix name=\"\" IRI=\"http://www.w3.org/2002/07/owl#\"/>\n" +
                "    <Prefix name=\"owl\" IRI=\"http://www.w3.org/2002/07/owl#\"/>\n" +
                "    <Prefix name=\"rdf\" IRI=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/>\n" +
                "    <Prefix name=\"xsd\" IRI=\"http://www.w3.org/2001/XMLSchema#\"/>\n" +
                "    <Prefix name=\"rdfs\" IRI=\"http://www.w3.org/2000/01/rdf-schema#\"/>\n" +
                "    <Prefix name=\""+name+"\" IRI=\""+iri+"#\"/>\n";
        /**
         * Classes Declarations
         * */

        ArrayList<Attributes> all=new ArrayList<>();
        for(Iterator<Concepts> i=ontology.concepts.iterator();i.hasNext();){
            Concepts ctemp=i.next();
            String nome;
            if(ctemp.name.indexOf("#")>=0){
                nome=ctemp.name.substring(ctemp.name.indexOf("#")+1);
            }else{
                nome=ctemp.name;
            }
            finalontologyfile+="" +
                    "       <Declaration>\n" +
                    "           <Class IRI=\"&"+name+";"+nome+"\"/>\n" +
                    "       </Declaration>\n";
            all.addAll(ctemp.atribute);
        }
        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the Class!");
        /**
         * Properties Declaration
         * */
        ArrayList<String> objectprop=new ArrayList<>();
        for(Iterator<TripleDomain> i=ontology.tripledomain.iterator();i.hasNext();){
            TripleDomain td=i.next();
            if(!objectprop.contains(td.relation)){
                objectprop.add(td.relation);
            }
        }
        for(Iterator<TripleRange> i=ontology.triplerange.iterator();i.hasNext();){
            TripleRange tr=i.next();
            if(!objectprop.contains(tr.relation)){
                objectprop.add(tr.relation);
            }
        }
        for(Iterator<String> i=objectprop.iterator();i.hasNext();){
            String otemp=i.next();
            if(otemp.indexOf("#")>=0){
                otemp=otemp.substring(otemp.indexOf("#")+1);
            }
            finalontologyfile+="" +
                    "       <Declaration>\n" +
                    "           <ObjectProperty IRI=\"&"+name+";"+otemp+"\"/>\n" +
                    "       </Declaration>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the ObjectProperty!");
        /**
         * NamedIndividuals Declaration
         * */
        jTextArea1.setText(jTextArea1.getText()+"\nInstances Generation!");
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("metajson.json"));
        JSONArray msg = (JSONArray) jsonObject.get("instancias");
        for(Iterator<JSONObject> i = msg.iterator();i.hasNext();){
            JSONObject obj=i.next();
            finalontologyfile+="" +
                    "       <Declaration>\n" +
                    "           <NamedIndividual IRI=\"#"+obj.get("name").toString()+"\"/>\n" +
                    "       </Declaration>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the NamedIndividual!");
        /**
         * Hierarchies
         * */
        for(Iterator<Hierarchies> i=ontology.hierarcy.iterator();i.hasNext();){
            Hierarchies htemp=i.next();
            String sub,mast;
            if(htemp.class_name.name.indexOf("#")>=0){
                mast=htemp.class_name.name.substring(htemp.class_name.name.indexOf("#")+1);
            }else{
                mast=htemp.class_name.name;
            }
            if(htemp.subclass_name.name.indexOf("#")>=0){
                sub=htemp.subclass_name.name.substring(htemp.subclass_name.name.indexOf("#")+1);
            }else{
                sub=htemp.subclass_name.name;
            }
            finalontologyfile+="" +
                    "       <SubClassOf>\n" +
                    "           <Class IRI=\"&"+name+";"+sub+"\"/>\n" +
                    "           <Class IRI=\"&"+name+";"+mast+"\"/>\n" +
                    "       </SubClassOf>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the SubClassOf!");
        /**
         * ClassAssertion
         * */


        for(Iterator<JSONObject> i = msg.iterator();i.hasNext();){
            JSONObject obj=i.next();
            finalontologyfile+="" +
                    "           <ClassAssertion>\n" +
                    "               <Class IRI=\"&"+name+";"+obj.get("type").toString()+"\"/>\n" +
                    "               <NamedIndividual IRI=\"#"+obj.get("name").toString()+"\"/>\n" +
                    "           </ClassAssertion>\n";

        }
        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the ClassAssertion!");
        /**
         * ObjectPropertyAssertion
         * */
        for(Iterator<JSONObject> i = msg.iterator();i.hasNext();){
            JSONObject obj=i.next();
            if(obj.containsKey("objprop")){
                JSONArray object=(JSONArray)obj.get("objprop");
                for(Iterator<JSONObject> o = object.iterator();o.hasNext();){
                    JSONObject otemp=o.next();
                    finalontologyfile+="" +
                            "           <ObjectPropertyAssertion>\n" +
                            "               <ObjectProperty IRI=\"#"+otemp.get("prop").toString()+"\"/>\n" +
                            "               <NamedIndividual IRI=\"#"+obj.get("name").toString()+"\"/>\n" +
                            "               <NamedIndividual IRI=\"#"+otemp.get("data").toString()+"\"/>\n" +
                            "           </ObjectPropertyAssertion>\n";
                }
            }
        }
        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the ObjectPropertyAssertion!");
        Iterator atributos1=all.iterator();
        while(atributos1.hasNext()){
            Atributes atmp=(Atributes)atributos1.next();
            finalontologyfile+=""+
                    "    <Declaration>\n" +
                    "        <DataProperty IRI=\"#"+atmp.name+"\"/>\n" +
                    "    </Declaration>\n";
        }
        /**
         * ObjectPropertyDomain
         * */
         for(Iterator<TripleDomain> i=ontology.tripledomain.iterator();i.hasNext();){
            TripleDomain trtemp=i.next();
            String relation,domain;
            if(trtemp.relation.indexOf("#")>=0){
                relation=trtemp.relation.substring(trtemp.relation.indexOf("#")+1);
            }else{
                relation=trtemp.relation;
            }
            if(trtemp.domain.indexOf("#")>=0){
                domain=trtemp.domain.substring(trtemp.domain.indexOf("#")+1);
            }else{
                domain=trtemp.domain;
            }
            finalontologyfile+="" +
                    "           <ObjectPropertyDomain>\n" +
                    "               <ObjectProperty IRI=\"&"+name+";"+relation+"\"/>\n" +
                    "               <Class IRI=\"&"+name+";"+domain+"\"/>\n" +
                    "           </ObjectPropertyDomain>\n";
        }
        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the ObjectPropertyDomain!");
        /**
         * ObjectPropertyRange
         * */
         for(Iterator<TripleRange> i=ontology.triplerange.iterator();i.hasNext();){
            TripleRange trtemp=i.next();
            String relation,range;
            if(trtemp.relation.indexOf("#")>=0){
                relation=trtemp.relation.substring(trtemp.relation.indexOf("#")+1);
            }else{
                relation=trtemp.relation;
            }
            if(trtemp.range.indexOf("#")>=0){
                range=trtemp.range.substring(trtemp.range.indexOf("#")+1);
            }else{
                range=trtemp.range;
            }
            finalontologyfile+="" +
                    "           <ObjectPropertyRange>\n" +
                    "               <ObjectProperty IRI=\"&"+name+";"+relation+"\"/>\n" +
                    "               <Class IRI=\"&"+name+";"+range+"\"/>\n" +
                    "           </ObjectPropertyRange>\n";
        }
        Iterator atributos2=ontology.concepts.iterator();
        while(atributos2.hasNext()){
            source.Concepts ctmp1=(source.Concepts)atributos2.next();
            Iterator lista1=ctmp1.atribute.iterator();
            while(lista1.hasNext()){
                Atributes a1=(Atributes)lista1.next();
                finalontologyfile+=""+
                        "    <DataPropertyDomain>\n" +
                        "        <DataProperty IRI=\"#"+a1.name+"\"/>\n" +
                        "        <Class IRI=\"#"+ctmp1.name+"\"/>\n" +
                        "    </DataPropertyDomain>";
            }
        }
        jTextArea1.setText(jTextArea1.getText()+"\n85%");
        Iterator atributos3=ontology.concepts.iterator();
        while(atributos3.hasNext()){
            source.Concepts ctmp2=(source.Concepts)atributos3.next();
            Iterator lista2=ctmp2.atribute.iterator();
            while(lista2.hasNext()){
                Atributes a2=(Atributes)lista2.next();
                finalontologyfile+=""+
                        "    <DataPropertyRange>\n" +
                        "        <DataProperty IRI=\"#"+a2.name+"\"/>\n" +
                        "        <Datatype abbreviatedIRI=\"xsd:"+a2.type+"\"/>\n" +
                        "    </DataPropertyRange>";
            }
        }

        jTextArea1.setText(jTextArea1.getText()+"\nGenerating the ObjectPropertyRange!");
        finalontologyfile+="</Ontology>";
        try {
            FileWriter file = new FileWriter(name+".owl");
            file.write(finalontologyfile);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generateRDF(Ontology_RDF ontology, String iri, String name, JTextArea jTextArea1) throws IOException, ParseException {
        jTextArea1.setText(jTextArea1.getText()+"\nStarting the new Ontology generation!");
        String finalontologyfile="" +
                "<?xml version=\"1.0\"?>\n" +
                "\n" +
                "\n" +
                "<!DOCTYPE rdf:RDF [\n" +
                "    <!ENTITY owl \"http://www.w3.org/2002/07/owl#\" >\n" +
                "    <!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\" >\n" +
                "    <!ENTITY rdfs \"http://www.w3.org/2000/01/rdf-schema#\" >\n" +
                "    <!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" >\n" +
                "    <!ENTITY "+name+" \""+iri+"#\" >\n" +
                "]>\n" +
                "\n" +
                "\n" +
                "<rdf:RDF xmlns=\"http://www.w3.org/2002/07/owl#\"\n" +
                "     xml:base=\"http://www.w3.org/2002/07/owl\"\n" +
                "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n" +
                "     xmlns:"+name+"=\""+iri+"#\"\n" +
                "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n" +
                "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n" +
                "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n" +
                "    <Ontology rdf:about=\""+iri+"\"/>\n\n";

        /**
         * Object Properties
         * */
        jTextArea1.setText(jTextArea1.getText()+"\nObjectProperties!");
        for(Iterator i=ontology.objectprop.iterator();i.hasNext();){
            ObjectProperty otemp=(ObjectProperty)i.next();
            String nome,domain,range;
            if(otemp.relation.indexOf("#")>=0){
                nome=otemp.relation.substring(otemp.relation.indexOf("#")+1);
            }else{
                nome=otemp.relation;
            }
            if(otemp.range.indexOf("#")>=0){
                range=otemp.range.substring(otemp.range.indexOf("#")+1);
            }else{
                range=otemp.range;
            }
            for(Iterator<String> dom=otemp.domain.iterator();dom.hasNext();){
                String t=dom.next();
                if(t.indexOf("#")>=0){
                    domain=t.substring(t.indexOf("#")+1);
                }else{
                    domain=t;
                }
                if(otemp.max<0 && otemp.min<0){
                    finalontologyfile+="" +
                            "       <ObjectProperty rdf:about=\"&"+name+";"+nome+"\">\n" +
                            "           <rdfs:domain rdf:resource=\"&"+name+";"+domain+"\"/>\n" +
                            "           <rdfs:range rdf:resource=\"&"+name+";"+range+"\"/>\n" +
                            "       </ObjectProperty>\n\n";
                }else{
                    if(otemp.max>0){
                        finalontologyfile+="" +
                                "       <ObjectProperty rdf:about=\"&"+name+";"+nome+"\">\n" +
                                "           <rdfs:domain rdf:resource=\"&"+name+";"+domain+"\"/>\n" +
                                "           <rdfs:range>\n" +
                                "            <Restriction>\n" +
                                "                <onProperty rdf:resource=\"&"+name+";"+nome+"\"/>\n" +
                                "                <onClass rdf:resource=\"&"+name+";"+range+"\"/>\n" +
                                "                <maxQualifiedCardinality rdf:datatype=\"&xsd;nonNegativeInteger\">"+otemp.max+"</maxQualifiedCardinality>\n" +
                                "            </Restriction>\n" +
                                "        </rdfs:range>" +
                                "       </ObjectProperty>\n\n";
                    }
                    if(otemp.min>0){
                        finalontologyfile+="" +
                                "       <ObjectProperty rdf:about=\"&"+name+";"+nome+"\">\n" +
                                "           <rdfs:domain rdf:resource=\"&"+name+";"+domain+"\"/>\n" +
                                "           <rdfs:range>\n" +
                                "            <Restriction>\n" +
                                "                <onProperty rdf:resource=\"&"+name+";"+nome+"\"/>\n" +
                                "                <onClass rdf:resource=\"&"+name+";"+range+"\"/>\n" +
                                "                <minQualifiedCardinality rdf:datatype=\"&xsd;nonNegativeInteger\">"+otemp.min+"</minQualifiedCardinality>\n" +
                                "            </Restriction>\n" +
                                "        </rdfs:range>" +
                                "       </ObjectProperty>\n\n";
                    }
                }

            }
        }

        /**
         * Data Properties
         * */
        jTextArea1.setText(jTextArea1.getText()+"\nDataProperties!");
        for(Iterator i=ontology.dataprop.iterator();i.hasNext();){
            DataProperty dtemp=(DataProperty)i.next();
            String nome,domain;
            if(dtemp.name.indexOf("#")>=0){
                nome=dtemp.name.substring(dtemp.name.indexOf("#")+1);
            }else{
                nome=dtemp.name;
            }
            if(dtemp.domain.indexOf("#")>=0){
                domain=dtemp.domain.substring(dtemp.domain.indexOf("#")+1);
            }else{
                domain=dtemp.domain;
            }
            finalontologyfile+="" +
                    "       <DatatypeProperty rdf:about=\"&"+name+";"+nome+"\">\n" +
                    "           <rdfs:domain rdf:resource=\"&"+name+";"+domain+"\"/>\n" +
                    "           <rdfs:range rdf:resource=\"&xsd;"+dtemp.type+"\"/>\n" +
                    "       </DatatypeProperty>\n\n";
        }

        /**
         * Classes Properties
         * */
        jTextArea1.setText(jTextArea1.getText()+"\nClassesProperties!");
        for(Iterator i=ontology.classes.iterator();i.hasNext();){
            Classes ctemp=(Classes)i.next();
            String nome,upclasses;
            if(ctemp.name.indexOf("#")>=0){
                nome=ctemp.name.substring(ctemp.name.indexOf("#")+1);
            }else{
                nome=ctemp.name;
            }
            if(ctemp.upclasses.indexOf("#")>=0){
                upclasses=ctemp.upclasses.substring(ctemp.upclasses.indexOf("#")+1);
            }else{
                upclasses=ctemp.upclasses;
            }
            if(!nome.equals("Thing") && !upclasses.equals("Thing")){
                finalontologyfile+="" +
                        "       <Class rdf:about=\"&"+name+";"+nome+"\">\n" +
                        "           <rdfs:subClassOf rdf:resource=\"&"+name+";"+upclasses+"\"/>\n" +
                        "       </Class>\n\n";
            }else{
                if(!nome.equals("Thing") && upclasses.equals("Thing")){
                    finalontologyfile+="" +
                            "       <Class rdf:about=\"&"+name+";"+nome+"\">\n" +
                            "       </Class>\n\n";
                }
            }

        }

        /**
         * Intances Properties
         * */
        jTextArea1.setText(jTextArea1.getText()+"\nInstances Generation!");
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("metajson.json"));
        JSONArray msg = (JSONArray) jsonObject.get("instancias");
        for(Iterator<JSONObject> i = msg.iterator();i.hasNext();){
            JSONObject obj=i.next();
            finalontologyfile+="" +
                    "\n" +
                    "    <NamedIndividual rdf:about=\"&"+name+";"+obj.get("name").toString()+"\">\n" +
                    "        <rdf:type rdf:resource=\"&"+name+";"+obj.get("type")+"\"/>\n";
            if(obj.containsKey("dataprop")){
                JSONArray data=(JSONArray)obj.get("dataprop");
                for(Iterator<JSONObject> d = data.iterator();d.hasNext();){
                    JSONObject dtemp=d.next();
                    finalontologyfile+=""+
                            "        <"+name+":"+dtemp.get("prop").toString()+">"+dtemp.get("data").toString()+"</"+name+":"+dtemp.get("prop").toString()+">\n";
                }
            }
            if(obj.containsKey("objprop")){
                JSONArray object=(JSONArray)obj.get("objprop");
                for(Iterator<JSONObject> o = object.iterator();o.hasNext();){
                    JSONObject otemp=o.next();
                    finalontologyfile+=""+
                            "        <"+name+":"+otemp.get("prop").toString()+" rdf:resource=\"&"+name+";"+otemp.get("data").toString()+"\"/>\n";
                }
            }
            finalontologyfile+=""+
                    "    </NamedIndividual>\n\n";
        }
        finalontologyfile+="" +
                "</rdf:RDF>";
        try {
            FileWriter file = new FileWriter(name+".owl");
            file.write(finalontologyfile);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
