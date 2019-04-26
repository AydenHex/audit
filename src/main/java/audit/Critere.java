package audit;

import java.util.ArrayList;

public class Critere {

    Critere parent;
    ArrayList<Critere> enfants;
    String intitule;
    String texte;
    ArrayList<Reference> references;
    Double note;
    Double coefficient;


    public Critere(Critere parent, String intitule, String texte, ArrayList<Reference> references, Double coefficient, Double note) {
        this.enfants = new ArrayList<Critere>();
        this.parent = parent;
        this.intitule = intitule;
        this.texte = texte;
        this.references = references;
        this.coefficient = coefficient;
        this.note = note;
    }

    public Critere(Critere parent, String intitule, String texte, ArrayList<Reference> references, Double coefficient) {
        this.enfants = new ArrayList<Critere>();
        this.parent = parent;
        this.intitule = intitule;
        this.texte = texte;
        this.references = references;
        this.coefficient = coefficient;
        this.note = 0.00;
    }

    public Critere(String intitule, String texte, ArrayList<Reference> references, Double coefficient) {
        this.enfants = new ArrayList<Critere>();
        this.intitule = intitule;
        this.texte = texte;
        this.references = references;
        this.coefficient = coefficient;
        this.note = 0.00;
    }


    public Critere getParent() {
        return this.parent;
    }

    public void setParent(Critere parent) {
        this.parent = parent;
    }

    public String getIntitule() {
        return this.intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getTexte() {
        return this.texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public ArrayList<Reference> getReferences() {
        return this.references;
    }

    public void setReferences(ArrayList<Reference> references) {
        this.references = references;
    }

    public Double getNote() {
        return this.note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Double getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    public ArrayList<Critere> getEnfants() {
        return this.enfants;
    }

    public void setEnfants(ArrayList<Critere> enfants) {
        this.enfants = enfants;
    }

    public void calculNote() {
        if (this.note != null) {
            double note = 0.00;
            if (this.getEnfants() != null) {
                for (Critere critere : this.enfants) {
                    if (critere.getNote() == 0.00) {
                        critere.calculNote();        
                    } 
                    note += critere.getNote() * critere.getCoefficient();
                }
                this.setNote(note);
            }
        }

    }

    public String getArbo(){
        String arbo = String.format("%s %f \n", this.intitule, this.note);
        if (this.getEnfants() != null) {
            for (Critere critere : this.enfants) {
                arbo += critere.getArbo() + "";
            }
        }
        return arbo;
    }
}