package mvc.models;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

import mvc.models.*;

public class Audit {
    
    Auditeur auditeur;
    Critere parent;

    public Audit(Auditeur auditeur, Critere parent){
        this.auditeur = auditeur;
        this.parent = parent;
    }

    public String displayTree(){
       return this.parent.getArbo();
    }

    public void calculNote() {
        this.parent.calculNote();
    }

    public void backup (String path) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(path);
        writer.println(this.displayTree());
        writer.close();
    }

}