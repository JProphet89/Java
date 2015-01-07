package Lavanda;
import java.util.ArrayList;
public class Instances {
    public String name;
   public String type;    public ArrayList<Dataproperties> dataproperties;
    public ArrayList<Objectproperties> objectproperties;
    public Instances(){
        name="";
        dataproperties=new ArrayList<>();
        objectproperties=new ArrayList<>();
    }
}