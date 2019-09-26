package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame {
    public static void createAndShowGUI1(){


        JFrame jFrame = new JFrame("Question 1.2");
        jFrame.setSize(400,400);

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("it’s the top destination for anyone who wants to express the love for books. The largest marketplace with hand-crafted goods offers thousands of literary quotes – on posters, jewelry, personal items, electronic accessories, and clothes.");
        JLabel jLabel1 = new JLabel("\nThe site offers a huge variety of merchandise, from clothing, to home decor, to personal accessories. What’s more, users can upload their own image and create their own design.");
        JLabel jLabel2 = new JLabel("Etsy & Zazzle");
        JButton jButton = new JButton("Click me");

        jFrame.add(jLabel);
        jFrame.add(jLabel1);
        jFrame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.add(jLabel2);
            }
        });        ;

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI1();
    }
}
