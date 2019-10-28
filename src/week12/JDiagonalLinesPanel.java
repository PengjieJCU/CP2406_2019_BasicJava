package week12;

import javax.swing.*;
import java.awt.*;

public class JDiagonalLinesPanel extends JPanel {

    public JDiagonalLinesPanel() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);

        gr.drawRect (20, 20, 420, 420);

        int x = 20;
        int y = 20;

        for (int i = 0; i < 430; i+= 10) {
            gr.drawLine(x + i, y , x , y + i);
        }
        x = 440;
        y = 440;
        for (int i = 0; i < 430; i+= 10) {
            gr.drawLine(x - i, y , x , y - i);
        }


    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JDiagonalLinesPanel());
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
