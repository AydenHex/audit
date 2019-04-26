package frame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class FrameTest extends JFrame {

    GridLayout experiment;
    JPanel jPanel;
    JRadioButton radioButton;
    JCheckBox checkBox;
    JTextField textField;
    JTextArea textArea;
    JButton jButton;
    JScrollPane jScrollPane;

    JLabel nom;
    JLabel bio;

    public FrameTest(){

        super();

        this.experiment = new GridLayout(7, 1);
        this.jPanel = new JPanel();
        this.radioButton = new JRadioButton("Sports");
        this.checkBox = new JCheckBox("Elephant");
        this.textField = new JTextField();
        this.textArea = new JTextArea(5,5);
        this.jButton = new JButton("Clic");
        this.jScrollPane = new JScrollPane(this.textArea);
        this.nom = new JLabel("Nom : ");
        this.bio = new JLabel("Bio : ");

        this.nom.setLabelFor(this.textField);
        this.bio.setLabelFor(this.textArea);

        this.build();
    }

    public void build() {
        
        this.setTitle("Exo Swing");
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.jPanel.setLayout(this.experiment);

        this.jPanel.add(this.radioButton);
        this.jPanel.add(this.checkBox);
        this.jPanel.add(this.nom);
        this.jPanel.add(this.textField);
        this.jPanel.add(this.bio);
        this.jPanel.add(this.jScrollPane);
        this.jPanel.add(this.jButton);

        this.getContentPane().add(this.jPanel);
    }
}