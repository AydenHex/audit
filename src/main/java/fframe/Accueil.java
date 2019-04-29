package fframe;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class Accueil extends JFrame {

    private static final long serialVersionUID = 1L;
    private Menu menu;
    private JPanel content;
    private JLabel labelLogin;
    private JLabel labelPassword;
    private JPasswordField passwordField;
    private JTextField loginField;
    private JButton button;
    private Font font;

    public Accueil() {
        super();
        
        this.menu = new Menu();
        this.labelLogin = new JLabel("Login : ");
        this.labelPassword = new JLabel("Password :");
        this.passwordField = new JPasswordField(15);
        this.loginField = new JTextField(15);
        this.button = new JButton("Se connecter");
        this.font = new Font("Serif", Font.PLAIN, 15);

        this.content = new JPanel(new GridBagLayout());
        this.labelLogin.setFont(this.font);
        this.loginField.setFont(this.font);
        this.labelPassword.setFont(this.font);
        this.passwordField.setFont(this.font);
        this.button.setFont(this.font);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 30);
        this.content.add(this.labelLogin, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 5;
        this.content.add(this.loginField, c);

        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(0, 0, 10, 30);
        this.content.add(this.labelPassword, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 5;
        this.content.add(this.passwordField, c);

        c.gridx = 1;
        c.gridy = 2;
        this.content.add(this.button, c);
        
        this.setContentPane(this.content);
        this.setJMenuBar(this.menu);

    }
}