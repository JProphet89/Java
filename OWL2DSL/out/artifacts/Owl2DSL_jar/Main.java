import Lavanda.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class Main {
	public static void main(String args[]) throws IOException {
   		JSONObject metajson = new JSONObject();
   		JSONArray instancias = new JSONArray();
      	LavandaLexer lex = new LavandaLexer(new ANTLRFileStream(args[0], "UTF8"));
       	CommonTokenStream tokens = new CommonTokenStream(lex);
       	LavandaParser g = new LavandaParser(tokens,null);
      	try {
        	for(Iterator i=g.thing().insta.iterator();i.hasNext();){
        		JSONObject obj = new JSONObject();
               	Instances temp=(Instances)i.next();
               	obj.put("name",temp.name.replaceAll("\"",""));
               	obj.put("type",temp.type.replaceAll("\"",""));
               	if(!temp.dataproperties.isEmpty()){
               		JSONArray data = new JSONArray();
               		for(Iterator j=temp.dataproperties.iterator();j.hasNext();){
                		Dataproperties dtemp=(Dataproperties)j.next();
                		JSONObject dataprop = new JSONObject();
                		dataprop.put("prop",dtemp.property);
                		dataprop.put("data",dtemp.data.replaceAll("\"",""));
                		data.add(dataprop);
               		}
               		obj.put("dataprop",data);
               	}
               	if(!temp.objectproperties.isEmpty()){
               		JSONArray objetp = new JSONArray();
               		for(Iterator j=temp.objectproperties.iterator();j.hasNext();){
                		Objectproperties o=(Objectproperties)j.next();
                		JSONObject objprop = new JSONObject();
                		objprop.put("prop",o.property);
                		objprop.put("data",o.object.replaceAll("\"",""));
                		objetp.add(objprop);
               		}
               		obj.put("objprop",objetp);
               	}
               	instancias.add(obj);
           	}
           	metajson.put("instancias",instancias);
       	} catch (RecognitionException e) {
           e.printStackTrace();
       	}
       	try {
       		FileWriter file = new FileWriter("metajson.json");
			file.write(metajson.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}