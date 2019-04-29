package mvc.controleurs;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import mvc.models.*;
import mvc.vues.*;

public class AccueilController implements ActionListener {
    private Accueil accueil;
    private Auditeur auditeur;

    public AccueilController(Accueil accueil) {
        this.accueil = accueil;
        this.auditeur = new Auditeur();
        this.accueil.setListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String login = this.accueil.getLogin();
        String mdp = this.accueil.getMdp();

        this.auditeur.setLogin(login);
        this.auditeur.setMdp(mdp);

        if (auditeur.seConnecter()) {
            System.out.println("CONNEXION OK");
        } else {
            System.out.println("CONNEXION DOWN");
        }
    }

    
}