import javax.swing.*;

import GramConstructor.GramarConstructor;
import GramConstructor.OWL2Onto;
import RDF.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import OWL.*;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import source.*;
import java.io.File;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jprophet89
 */
public class Main extends javax.swing.JFrame {

    File owlfile=null,ontofile=null;
    Ontology ontology;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Onto2Owl = new javax.swing.JTabbedPane();
        Ontopanel = new javax.swing.JPanel();
        but_ont_file = new javax.swing.JButton();
        but_onto_run = new javax.swing.JButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        file_path1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea2 = new javax.swing.JTextArea();
        Owlpanel = new javax.swing.JPanel();
        but_owl_file = new javax.swing.JButton();
        but_owl_run = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        file_path2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Onto2Gra");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        but_ont_file.setText("Select File");
        but_ont_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_ont_fileMousePressed(evt);
            }
        });

        but_onto_run.setText("Run");
        but_onto_run.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try {
                    try {
                        but_onto_runMousePressed(evt);
                    } catch (DocumentException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        radio1.setSelected(true);
        radio1.setText("Onto2Owl");
        radio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radio1MousePressed(evt);
            }
        });

        radio2.setText("Owl2Onto");
        radio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio2MouseClicked(evt);
            }
        });

        file_path1.setText("File Selected::");

        textarea1.setColumns(20);
        textarea1.setRows(5);
        jScrollPane1.setViewportView(textarea1);

        javax.swing.GroupLayout OntopanelLayout = new javax.swing.GroupLayout(Ontopanel);
        Ontopanel.setLayout(OntopanelLayout);
        OntopanelLayout.setHorizontalGroup(
                OntopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OntopanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OntopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(OntopanelLayout.createSequentialGroup()
                                                .addGroup(OntopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(but_onto_run, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(but_ont_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(OntopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(OntopanelLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(radio1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(radio2)
                                                                .addContainerGap(612, Short.MAX_VALUE))
                                                        .addGroup(OntopanelLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(file_path1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addComponent(jScrollPane1)))
        );
        OntopanelLayout.setVerticalGroup(
                OntopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OntopanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OntopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(but_ont_file)
                                        .addComponent(radio1)
                                        .addComponent(radio2))
                                .addGap(18, 18, 18)
                                .addGroup(OntopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(but_onto_run)
                                        .addComponent(file_path1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                                .addContainerGap())
        );

        Onto2Owl.addTab("Onto2OWl", Ontopanel);

        but_owl_file.setText("Selected File");
        but_owl_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_owl_fileMousePressed(evt);
            }
        });

        but_owl_run.setText("Run");
        but_owl_run.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try {
                    try {
                        but_owl_runMousePressed(evt);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (DocumentException e) {
                    e.printStackTrace();
                }
            }
        });

        file_path2.setText("File::");

        textarea2.setColumns(20);
        textarea2.setRows(5);
        jScrollPane2.setViewportView(textarea2);

        javax.swing.GroupLayout OwlpanelLayout = new javax.swing.GroupLayout(Owlpanel);
        Owlpanel.setLayout(OwlpanelLayout);
        OwlpanelLayout.setHorizontalGroup(
                OwlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OwlpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OwlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(but_owl_run, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(but_owl_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(OwlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(OwlpanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(file_path2)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OwlpanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(OwlpanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2)
                                .addContainerGap())
        );
        OwlpanelLayout.setVerticalGroup(
                OwlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OwlpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OwlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(but_owl_file)
                                        .addComponent(file_path2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(OwlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(but_owl_run))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                .addContainerGap())
        );

        Onto2Owl.addTab("Owl2DSL", Owlpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Onto2Owl, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Onto2Owl)
        );

        pack();
    }// </editor-fold>
    private void but_owl_fileMousePressed(java.awt.event.MouseEvent evt) {
        //Select file For OWl2DSL
        this.but_owl_file.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    file_path2.setText("File::"+selectedFile.getName());
                    owlfile=selectedFile;
                }
            }
        });

    }

    private void but_owl_runMousePressed(java.awt.event.MouseEvent evt) throws DocumentException, IOException {
        //Run OWL2DSL
        if(!owlfile.exists()){
            textarea2.setText("\nSelect a file first\n");
            return;
        }
        boolean flag;
        textarea2.setText("");
        String iri="";
        SAXReader reader = new SAXReader();
        Document doc = reader.read(owlfile);
        Element root = doc.getRootElement();
        if(!root.elements("Class").isEmpty()){
            textarea2.setText(textarea2.getText()+"It was found a RDF::file\n\n\n");
            RDF parser1=new RDF();
            this.ontology=parser1.RDFparser(this.owlfile, this.textarea2,this.jProgressBar1);
            flag=true;
            if(root.element("Ontology").attributeValue("about")!=null){
                iri=""+root.element("Ontology").attributeValue("about");
            }
        }else{
            textarea2.setText(textarea2.getText()+"It was found a OWL::file\n\n\n");
            OWL parser=new OWL();
            this.ontology=parser.OWlparser(this.owlfile, this.textarea2, this.jProgressBar1);
            flag=false;
            if(root.attributeValue("base")!=null){
                iri=root.attributeValue("base");
            }else{
                if(root.attributeValue("ontologyIRI")!=null){
                    iri=root.attributeValue("ontologyIRI");
                }
            }
        }
        if (this.ontology!=null){
            GramarConstructor gconstructor=new GramarConstructor();
            gconstructor.buildgrammartree(this.ontology,owlfile.getName(),flag,owlfile.getAbsolutePath(),iri);
        }

    }

    private void radio2MouseClicked(java.awt.event.MouseEvent evt) {
        this.radio2.setSelected(true);
        this.radio1.setSelected(false);
    }

    private void radio1MousePressed(java.awt.event.MouseEvent evt) {
        this.radio2.setSelected(false);
        this.radio1.setSelected(true);
    }

    private void but_ont_fileMousePressed(java.awt.event.MouseEvent evt) {
        //Select file Onto2Owl
        this.but_ont_file.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    file_path1.setText("File::"+selectedFile.getName());
                    ontofile=selectedFile;
                }
            }
        });
    }

    private void but_onto_runMousePressed(java.awt.event.MouseEvent evt) throws IOException, DocumentException {
        /**
         * Run Onto2OWl
         */
        if(radio1.isSelected()){
            if(!this.ontofile.exists()){
                return;
            }
            OntoDLLexer lex = new OntoDLLexer(new ANTLRFileStream(ontofile.getAbsolutePath(), "UTF8"));
            CommonTokenStream tokens = new CommonTokenStream(lex);
            OntoDLParser g = new OntoDLParser(tokens,null);
            try {
                Ontologies overturns=g.ontology();
                overturns.gerarowl(ontofile.getName().substring(0, ontofile.getName().indexOf(".")), this.textarea1);
            } catch (RecognitionException e) {
                e.printStackTrace();
            }
        }
        if(radio2.isSelected()){
            SAXReader reader = new SAXReader();
            Document doc = reader.read(ontofile);
            Element root = doc.getRootElement();
            if(!root.elements("Class").isEmpty()){
                textarea1.setText(textarea1.getText()+"It was found a RDF::file\n");
                RDF parser1=new RDF();
                this.ontology=parser1.RDFparser(this.ontofile, this.textarea1,this.jProgressBar1);
            }else{
                textarea1.setText(textarea1.getText()+"It was found a OWL::file\n");
                OWL parser=new OWL();
                this.ontology=parser.OWlparser(this.ontofile,this.textarea1,this.jProgressBar1);
            }
            if(this.ontology!=null){
                textarea1.setText(textarea1.getText()+"The onto file \n");
                OWL2Onto onto=new OWL2Onto();
                onto.Ontofilecreator(this.ontology,this.ontofile.getName().substring(0,ontofile.getName().indexOf(".")));
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTabbedPane Onto2Owl;
    private javax.swing.JPanel Ontopanel;
    private javax.swing.JPanel Owlpanel;
    private javax.swing.JButton but_ont_file;
    private javax.swing.JButton but_onto_run;
    private javax.swing.JButton but_owl_file;
    private javax.swing.JButton but_owl_run;
    private javax.swing.JLabel file_path1;
    private javax.swing.JLabel file_path2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea textarea2;
    // End of variables declaration
}

