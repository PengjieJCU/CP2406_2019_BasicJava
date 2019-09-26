package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame{
    public static void createAndShowGUI(){


        JFrame jFrame = new JFrame("Question 2");
        jFrame.setSize(400,400);

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton = new JButton("JButton");
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setEnabled(false);
            }
        });

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
