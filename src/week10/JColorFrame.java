package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorFrame extends JFrame implements ActionListener {
    BorderLayout borderLayout = new BorderLayout();
    JButton backgroundColorB = new JButton("Change Backgound Color");
    JPanel jPanelEast = new JPanel();
    JPanel jPanelWest = new JPanel();
    JPanel jPanelNorth = new JPanel();
    JPanel jPanelSouth = new JPanel();

    public JColorFrame(){
        setTitle("Question 4");
        setLayout(borderLayout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(backgroundColorB, BorderLayout.CENTER);
        add(jPanelEast, BorderLayout.EAST);
        add(jPanelWest, BorderLayout.WEST);
        add(jPanelNorth, BorderLayout.NORTH);
        add(jPanelSouth, BorderLayout.SOUTH);

        backgroundColorB.addActionListener(this);

        pack();
        setVisible(true);
    }
    int count = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        if (count == 1){
            jPanelEast.setBackground(Color.GREEN);
        } else if (count == 2) {
            jPanelWest.setBackground(Color.RED);
        }else if (count == 3){
            jPanelNorth.setBackground(Color.YELLOW);
        }else if (count == 4){
            jPanelSouth.setBackground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new JColorFrame();
    }
}
