package mvc.models;

public class Auditeur extends Utilisateur {

    public Auditeur(String login, String mdp) {
        super(login, mdp);
    }

    public Auditeur(){}

    public boolean seConnecter() {
        if (this.login.compareTo("crepo") + this.mdp.compareTo("nutella") == 0) {
            return true;
        }
        return false;
    }
}