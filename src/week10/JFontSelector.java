package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {
    int size = 12;
    String font;

    FlowLayout flowLayout = new FlowLayout();
    JButton timeNewRomanFontB = new JButton("Times New Roman");
    JButton calibriB = new JButton("Caliri");
    JButton arialB = new JButton("Arial");
    JButton helveticaB = new JButton("Helvetica");
    JButton baskerilleB = new JButton("Baskerille");
    JButton fontSizeSmall = new JButton("Small Size");
    JButton fontSizeLarge = new JButton("Large Size");
    Font timeNewRomanFont = new Font("Times New Roman", Font.BOLD, size);
    Font calibriFont = new Font("Calibri",Font.BOLD,size);
    Font arialFont = new Font("Arial", Font.BOLD,size);
    Font heleveticaFont = new Font("Helvetica", Font.BOLD, size);
    Font baskerilleFont = new Font("Baskerille", Font.BOLD, size);
    JLabel jLabel = new JLabel("I'm going to make him an offer he can't refuse");

    public JFontSelector(){
        setTitle("Question 3");
        setLayout(flowLayout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = timeNewRomanFont;

        add(timeNewRomanFontB);
        add(calibriB);
        add(arialB);
        add(helveticaB);
        add(baskerilleB);

        timeNewRomanFontB.addActionListener(this);
        calibriB.addActionListener(this);
        arialB.addActionListener(this);
        helveticaB.addActionListener(this);
        baskerilleB.addActionListener(this);

        add(jLabel);
        jLabel.setFont(timeNewRomanFont);
        add(fontSizeSmall);
        add(fontSizeLarge);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timeNewRomanFontB){
            jLabel.setFont(timeNewRomanFont);
        }else if (e.getSource() == calibriB){
            jLabel.setFont(calibriFont);
        }else if (e.getSource() == arialB){
            jLabel.setFont(arialFont);
        }else if (e.getSource() == helveticaB){
            jLabel.setFont(heleveticaFont);
        }else if (e.getSource() == baskerilleB){
            jLabel.setFont(baskerilleFont);
        }else if (e.getSource() == fontSizeSmall){
            size = 8;
        }else if (e.getSource() == fontSizeLarge){
            size = 18;
        }
    }

    public static void main(String[] args) {
        new JFontSelector();
    }
}
