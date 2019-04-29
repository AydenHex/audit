package main;

import java.awt.Dimension;
import java.util.ArrayList;

import mvc.controleurs.AccueilController;
import mvc.models.*;
import mvc.vues.*;

/**
 * Hello world!
 */
public final class ApplicationConsole {
    private ApplicationConsole() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Auditeur monAuditeur = new Auditeur("crepo", "nutella");

        Critere securiteSiteWeb = new Critere("Sécurité du site Web", "", new ArrayList<Reference>(), 1.00);
        Critere securiteAcces = new Critere(securiteSiteWeb, "Sécurité des accès", "", new ArrayList<Reference>(),
                0.40);
        Critere securiteServeur = new Critere(securiteSiteWeb, "Sécurité du serveur", "", new ArrayList<Reference>(),
                0.60);

        Critere securiteMotDePasse = new Critere(securiteAcces, "Sécurité des mots de passe", "",
                new ArrayList<Reference>(), 1.00);
        Critere motDePasseHacheBDD = new Critere(securiteMotDePasse, "Mot de passe haché dans la BDD", "",
                new ArrayList<Reference>(), 1.00, 0.70);
        Critere longeurMotDePasse = new Critere(securiteMotDePasse, "Longueur des mots de passe", "",
                new ArrayList<Reference>(), 4.00, 0.30);

        Critere phpinfo = new Critere(securiteServeur, "fichier phpinfo", "", new ArrayList<Reference>(), 0.40, 2.00);
        Critere droit = new Critere(securiteServeur, "Droit 777", "", new ArrayList<Reference>(), 0.60, 3.00);

        securiteSiteWeb.getEnfants().add(securiteAcces);
        securiteSiteWeb.getEnfants().add(securiteServeur);
        securiteAcces.getEnfants().add(securiteMotDePasse);
        securiteMotDePasse.getEnfants().add(motDePasseHacheBDD);
        securiteMotDePasse.getEnfants().add(longeurMotDePasse);
        securiteServeur.getEnfants().add(phpinfo);
        securiteServeur.getEnfants().add(droit);

        Audit mAudit = new Audit(monAuditeur, securiteSiteWeb);
        securiteSiteWeb.calculNote();
        mAudit.displayTree();

        Accueil accueil = new Accueil();
        accueil.setPreferredSize(new Dimension(800, 500));
        accueil.setLocationRelativeTo(null);
        accueil.pack();
        accueil.setVisible(true);

        AccueilController accueilController = new AccueilController(accueil);
        
        //System.out.println(monAuditeur.seConnecter("/home/quentin/Documents/user.txt"));

    }
}
