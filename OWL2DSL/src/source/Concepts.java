package source;

import java.util.ArrayList;

public class Concepts{
    public String name;
    public String description;
    public ArrayList<Atributes> atribute;

    public Concepts(){
        this.atribute=new ArrayList<Atributes>();
    }

    public Concepts(String thing) {
        this.name=thing;
    }
}