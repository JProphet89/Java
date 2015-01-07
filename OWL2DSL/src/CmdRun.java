import org.dom4j.DocumentException;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.IOException;

/**
 * Created by jprophet89 on 11/06/14.
 */
public class CmdRun {
    public OWL2GRA o2g=new OWL2GRA();

    public CmdRun(){
        o2g.setVisible(false);
    }


    public void run(String args[]) throws IOException, DocumentException, ParseException, InterruptedException {
        if(args[0].toLowerCase().equals("onto2owl")){
            o2g.ontofile=new File(args[1]);
            o2g.run_onto2owl();
            System.out.println(o2g.textarea_onto.getText());
            System.exit(0);
        }else{
            if(args[0].toLowerCase().equals("owl2dsl")){
                o2g.owlfile=new File(args[1]);
                o2g.run_owl2dsl();
                System.out.println(o2g.textarea_owl.getText());
                System.exit(0);
            }else{
                if(args[0].toLowerCase().equals("ddesc2owl")){
                    o2g.owlfile=new File(args[1]);
                    o2g.grammarfile=new File(args[2]);
                    o2g.ddescfile=new File(args[3]);
                    o2g.run_ddesc2owl();
                    System.out.println(o2g.jTextArea1.getText());
                    System.exit(0);
                }else{
                    System.out.println("************************** OWL2Gra **************************");
                    System.out.println("* ->Module Onto2OWL                                         *");
                    System.out.println("*    argument[0] => onto2owl                                *");
                    System.out.println("*    argument[1] => OntoDL file path                        *");
                    System.out.println("*************************************************************");
                    System.out.println("* ->Module OWL2DSL                                          *");
                    System.out.println("*    argument[0] => owl2dsl                                 *");
                    System.out.println("*    argument[1] => OWL file path                           *");
                    System.out.println("*************************************************************");
                    System.out.println("* ->Module DDesc2OWL                                        *");
                    System.out.println("*    argument[0] => ddesc2owl                               *");
                    System.out.println("*    argument[1] => OWL file path                           *");
                    System.out.println("*    argument[2] => Grammar file path                       *");
                    System.out.println("*    argument[3] => DDesc file path                         *");
                    System.out.println("*************************************************************");
                    System.exit(0);
                }
            }
        }
    }
}
