package fframe;

import javax.swing.*;

public class Menu extends JMenuBar {
    
    private static final long serialVersionUID = 2925566049298002130L;
    private JMenu audit;
    private JMenu aide;
    private JMenuItem nouvelAudit;
    private JMenuItem sauvegarder;
    
    public Menu() {
        super();

        audit = new JMenu("Audit");
        aide = new JMenu("Aide");
        nouvelAudit = new JMenuItem("Nouvel Audit");
        sauvegarder = new JMenuItem("Sauvegarder");
    }

    public void build() {
        this.audit.add(nouvelAudit);
        this.audit.add(sauvegarder);
        this.add(audit);
        this.add(aide);
    }
}