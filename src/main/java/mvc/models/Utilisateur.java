package mvc.models;

public class Utilisateur {
    protected String login;
    protected String mdp;

    public Utilisateur(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    public Utilisateur(){}

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
