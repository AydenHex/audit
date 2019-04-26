package utilisateur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Auditeur extends Utilisateur {

    public Auditeur(String login, String mdp) {
        super(login, mdp);
    }

    public boolean seConnecter(String path) {
        ArrayList<String> logins = new ArrayList<String>(2);
        try(FileReader reader = new FileReader(path);
            BufferedReader br = new BufferedReader(reader)) {
                String line;
                while ((line = br.readLine()) != null) {
                    logins.add(line);
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
        return (this.login.equals(logins.get(0)) && this.mdp.equals(logins.get(1)));
    } 
}