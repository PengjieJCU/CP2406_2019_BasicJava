package week10;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JLeftOrRight extends JFrame implements MouseListener {
    JLabel jLabel = new JLabel("Java programming question 7");

    public JLeftOrRight(){
        setTitle("Question 7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jLabel);
        addMouseListener(this);

        pack();
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jLabel.setText("Left to right value: " + e.getModifiersEx());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new JLeftOrRight();
    }
}
