/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OWL;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jprophet89
 */

public class Ontology {
    
    public ArrayList <Concepts> concepts;
    public ArrayList <Hierarchies> hierarcy;
    public ArrayList <TripleDomain> tripledomain;
    public ArrayList <TripleRange> triplerange;
    
    public Ontology(){
        this.concepts=new ArrayList<>();
        this.hierarcy=new ArrayList<>();
        this.tripledomain=new ArrayList<>();
        this.triplerange=new ArrayList<>();
    }

    public void addConcept(String name) {
        Concepts temp=new Concepts();
        temp.name=name;
        this.concepts.add(temp);
    }

    public void addHierarchy(String class1, String class2) {
        boolean flag1=false;
        boolean flag2=false;
        Concepts classe=null,subclasse=null;
        for(Iterator i=this.concepts.iterator();i.hasNext();){
            Concepts temp=(Concepts) i.next();
            if(temp.name.equals(class1)){
                classe=temp;
                flag1=true;
            }
            if(temp.name.equals(class2)){
                subclasse=temp;
                flag2=true;
            }
        }
        if(flag1==true && flag2==true){
            Hierarchies htemp=new Hierarchies();
            htemp.class_name=classe;
            htemp.subclass_name=subclasse;
            this.hierarcy.add(htemp);
        }else{
            return;
        }
    }

    public void addPropertyDomain(String domain, String relation) {
        if(domain!=null && relation!=null){
            this.tripledomain.add(new TripleDomain(domain,relation));
        }
    }

    public void addPropertyRange(String range,String relation, int max, int min){
        this.triplerange.add(new TripleRange(range, relation, max, min));
    }

    public void addPropertyRange(String range, String relation, int max, int min, ArrayList<String> lstconcept) {
        if(range!=null && relation!=null){
            for(int i=0;i<this.concepts.size();i++){
                for(Iterator<String> ls=lstconcept.iterator();ls.hasNext();){
                    if(ls.next().equals(this.concepts.get(i).name)){
                        this.concepts.get(i).triples.add(new TripleRange(range,relation,max,min));
                    }
                }
            }
        }
    }

    public void Delete_replic() {
        //Domain
        for(int i =0;i<this.tripledomain.size();i++){
            TripleDomain temp=this.tripledomain.get(i);
            for(int j=i+1;j<this.tripledomain.size();j++){
                if(temp.domain==this.tripledomain.get(j).domain && temp.relation==this.tripledomain.get(j).relation){
                    this.tripledomain.remove(j);
                    j--;
                }
            }
        }
        //Range
        for(int i =0;i<this.triplerange.size();i++){
            TripleRange temp=this.triplerange.get(i);
            for(int j=i+1;j<this.triplerange.size();j++){
                if(temp.range==this.triplerange.get(j).range && temp.relation==this.triplerange.get(j).relation){
                    this.triplerange.remove(j);
                    j--;
                }
            }
        }
    }


    public void addAttribute(String classe, String attribute, String type) {
        for(int i=0;i<this.concepts.size();i++){
            Concepts ctemp=this.concepts.get(i);
            if(ctemp.name.equals(classe)){
                Attributes newattribute=new Attributes();
                newattribute.name=attribute;
                newattribute.type=type;
                ctemp.atribute.add(newattribute);
                this.concepts.set(i,ctemp);
                return;
            }

        }
    }

    public void addAnnotation(String classe, String annotation) {
        for(int i=0;i<this.concepts.size();i++){
            Concepts ctemp=this.concepts.get(i);
            if(ctemp.name.equals(classe)){
                ctemp.description=annotation;
                this.concepts.set(i,ctemp);
                return;
            }

        }
    }

    public void processRange() {
        ArrayList<TripleRange> newlist=new ArrayList<>();
        for(int it1=0;it1<this.triplerange.size();it1++){
            TripleRange temp1=this.triplerange.get(it1);
            boolean flag=true;
            for(int it2=it1+1;it2<this.triplerange.size();it2++){
                TripleRange temp2=this.triplerange.get(it2);
                if(temp1.range.equals(temp2.range) && temp1.relation.equals(temp2.relation)){
                    TripleRange novo=new TripleRange();
                    novo.range=temp1.range;
                    novo.relation=temp1.relation;
                    if(temp1.max>temp2.max){
                        novo.max= temp1.max;
                    }else{
                        novo.max=temp2.max;
                    }
                    if(temp1.min>temp2.min){
                        novo.min= temp1.min;
                    }else{
                        novo.min=temp2.min;
                    }
                    newlist.add(novo);
                    this.triplerange.remove(it2);
                    flag=false;
                }
            }
            if(flag==true){
                newlist.add(temp1);
            }
        }
        this.triplerange=newlist;
        for(Iterator<TripleRange> test=this.triplerange.iterator();test.hasNext();){TripleRange temp=test.next();System.out.println("Triple=>"+temp.range+"|"+temp.relation+"|min=>"+temp.min+"|max=>"+temp.max);}
    }

    public void addConcept(String name, ArrayList<TripleRange> triples) {
        Concepts temp=new Concepts();
        temp.name=name;
        temp.triples=triples;
        this.concepts.add(temp);
    }
}
