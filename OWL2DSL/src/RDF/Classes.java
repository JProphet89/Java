package RDF;

import OWL.TripleRange;

import java.util.ArrayList;

/**
 * Created by jprophet89 on 01/03/14.
 */
public class Classes {
    public String name;
    public String upclasses;
    public ArrayList<TripleRange> triples;


    public Classes(String s, String s1) {
        this.name=s;
        this.upclasses=s1;
        this.triples=new ArrayList<>();
    }
}
