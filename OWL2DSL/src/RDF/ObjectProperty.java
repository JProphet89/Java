package RDF;

import java.util.ArrayList;

/**
 * Created by jprophet89 on 01/03/14.
 */
public class ObjectProperty {
    public String relation;
    public ArrayList<String> domain;
    public String range;
    public int max;
    public int min;

    public ObjectProperty(String relation, ArrayList<String> domain, String range,int max,int min) {
        this.relation=relation;
        this.domain=domain;
        this.range=range;
        this.max=max;
        this.min=min;
    }

    public ObjectProperty() {

    }
}
