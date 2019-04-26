package fframe;

import javax.swing.*;

public class Accueil extends JFrame {

    private static final long serialVersionUID = 1L;
    private Menu menu;

    public Accueil() {
        super();
        
        this.menu = new Menu();
        this.setJMenuBar(this.menu);

        this.build();

    }

    public void build() {
    }

}