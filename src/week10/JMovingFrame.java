package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovingFrame extends JFrame implements ActionListener {
    int x = 0;
    int y;

//    BorderLayout borderLayout = new BorderLayout();
    Container container = getContentPane();
    JPanel[] panels = new JPanel[5];
    JButton button = new JButton("Press me");
    JLabel[] labels = new JLabel[5];

    public JMovingFrame(){
        setTitle("Question 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLayout(new GridLayout(2,2));
        container.add(button);
        button.addActionListener(this);
        for (y = 0; y < 5; y++){
            labels[y] = new JLabel("");
            panels[y] = new JPanel();
            container.add(panels[y]);
            panels[y].add(labels[y]);
        }

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        labels[x].setText("");
        ++x;
        if (x == 5){
            x = 0;
        }
        labels[x].setText("Over here");
    }

    public static void main(String[] args) {
        new JMovingFrame();
    }
}
