package mvc.vues;

import javax.swing.*;

public class Menu extends JMenuBar {
    
    private static final long serialVersionUID = 2925566049298002130L;
    private JMenu audit;
    private JMenu aide;
    public JMenuItem nouvelAudit;
    private JMenuItem sauvegarder;
    
    public Menu() {
        super();

        this.audit = new JMenu("Audit");
        this.aide = new JMenu("Aide");
        this.nouvelAudit = new JMenuItem("Nouvel Audit");
        this.sauvegarder = new JMenuItem("Sauvegarder");

        this.build();
    }

    public void build() {
        this.audit.add(this.nouvelAudit);
        this.audit.add(this.sauvegarder);
        this.add(this.audit);
        this.add(this.aide);
    }
}