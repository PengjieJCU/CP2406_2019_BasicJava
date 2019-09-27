package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    int click = 0;


    FlowLayout flowLayout = new FlowLayout();
    JButton jButton = new JButton("Press me to change next fact!");
    JLabel jLabel = new JLabel("Turkeys Were Once Worshipped Like Gods.");
    JLabel jLabel1 = new JLabel("Paul Revere Never Actually Shouted, “The British Are Coming!”");
    JLabel jLabel2 = new JLabel("The Olympics Used to Award Medals for Art.");
    JLabel jLabel3 = new JLabel("One Time, 100 Imposters Claimed to Be Marie Antoinette’s Dead Son.");
    JLabel jLabel4 = new JLabel("Napoleon Was Once Attacked By a Horde of Bunnies.");

    public JHistoricalFacts(){
        setTitle("Question 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        setSize(600,500);
        add(jButton);
        jButton.addActionListener(this);
        add(jLabel);
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ++click;
        if (click == 1){
            remove(jLabel);
            add(jLabel1);
        }else if(click == 2){
            remove(jLabel1);
            add(jLabel2);
        }else if (click == 3){
            remove(jLabel2);
            add(jLabel3);
        }else if (click == 4){
            remove(jLabel3);
            add(jLabel4);
        }else if (click == 5){
            jButton.setEnabled(false);
        }
    validate();
    repaint();
    }

    public static void main(String[] args) {
        new JHistoricalFacts();
    }
}
