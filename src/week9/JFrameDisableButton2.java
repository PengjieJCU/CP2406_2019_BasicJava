package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame {
    public static void createAndShowGUI(){

        JFrame jFrame = new JFrame("Question 2.1");
        jFrame.setSize(600,400);

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton = new JButton("JButton");
        jFrame.add(jButton);

        JLabel label = new JLabel("");
        jFrame.add(label);

        jButton.addActionListener(new ActionListener() {
            int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {


                ++count;
                if (count == 8){
                    jButton.setEnabled(false);
                    label.setText("That's enough!");
                }
            }
        });

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
