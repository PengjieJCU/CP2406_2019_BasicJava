package week12;

import javax.swing.*;
import java.awt.*;

public class JNestedCirclesPanel extends JPanel {

    public JNestedCirclesPanel() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        int corner = 230;
        for (int i = 0; i < 480; i+= 30) {
            gr.drawOval (corner, corner, i, i);
            corner -= 15;
        }


    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JNestedCirclesPanel());
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}