package RDF;

import OWL.TripleRange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by jprophet89 on 01/03/14.
 */

public class Ontology_RDF {

    public ArrayList<ObjectProperty> objectprop=new ArrayList<>();

    public ArrayList<DataProperty> dataprop=new ArrayList<>();

    public ArrayList<Classes> classes=new ArrayList<>();

    public ArrayList<Annotations> anno=new ArrayList<>();

    public Ontology_RDF(){
        this.dataprop=new ArrayList<>();
        this.objectprop=new ArrayList<>();
        this.classes=new ArrayList<>();
    }

    public void add_DatatypeProperty(String att, String typ, String dom) {
        this.dataprop.add(new DataProperty(F_up(att),F_up(typ),F_up(dom)));

    }

    public void add_Classes(String name, String master) {
        this.classes.add(new Classes(F_up(name),F_up(master)));
    }

    public String F_up(String temp){
        String t=temp;
        temp=""+temp.charAt(0);
        temp=temp.toUpperCase();
        temp+=t.substring(1);
        temp=temp.replace("-","_");
        return temp;
    }

    public void add_triplerestriction(String domain, String relation, String range) {
        this.anno.add(new Annotations(domain, relation, range));
        System.out.println("Added the anotation =>"+domain+"-"+relation+"-"+range);
    }

    public void add_ObjectProperty(String relation, ArrayList<String> domain, String range, int max, int min) {
        System.out.println("OBPRO_RDF=>"+domain.toString()+"->"+relation+"->"+range+",min="+min+",max="+max);
        ObjectProperty obj = new ObjectProperty();
        obj.relation=relation;
        obj.range=range;
        obj.domain=domain;
        obj.min=min;
        obj.max=max;
        this.objectprop.add(obj);
    }

    public void organize_objpro_anota() {
        ArrayList<ObjectProperty> objprop=new ArrayList<>();
        for(int i=0;i<this.objectprop.size();i++){
            ObjectProperty o=this.objectprop.get(i);
            for(int j=0;j<this.objectprop.size();){
                Collections.sort(o.domain);
                Collections.sort(this.objectprop.get(j).domain);
                if(o.relation.equals(this.objectprop.get(j).relation) && o.range.equals(this.objectprop.get(j).range) && o.domain.equals(this.objectprop.get(j).domain)){
                    if(this.objectprop.get(j).min>0){
                        o.min=this.objectprop.get(j).min;
                    }
                    if(this.objectprop.get(j).max>0){
                        o.max=this.objectprop.get(j).max;
                    }
                    this.objectprop.remove(j);
                }else{
                    j++;
                }
            }
            System.out.println("NEW OBJECTPROPERTY------"+o.relation+"\n\nDomain="+o.domain.toString()+"\nRange=>"+o.range+"\nMax=>"+o.max+"\nMin=>"+o.min+"\n-----------\n");
            objprop.add(o);
        }

        for(Iterator<Annotations> anno=this.anno.iterator();anno.hasNext();){
            Annotations ano=anno.next();
            for(Iterator<ObjectProperty>objit=this.objectprop.iterator();objit.hasNext();){
                ObjectProperty obj=objit.next();
                if(ano.relation.equals(obj.relation) && ano.range.equals(obj.range) && obj.domain.contains(ano.domain)){
                    for(int i=0;i<this.classes.size();i++){
                        if(this.classes.get(i).name.equals(ano.domain)){
                            this.classes.get(i).triples.add(new TripleRange(ano.range,ano.relation,obj.max,obj.min));
                        }
                    }
                }
            }
        }
        this.objectprop=objprop;
    }
}
