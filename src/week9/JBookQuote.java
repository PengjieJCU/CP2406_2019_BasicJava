package week9;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class JBookQuote extends JFrame {
    public static void createAndShowGUI(){


        JFrame jFrame = new JFrame("Question 1");
        jFrame.setSize(400,400);

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("it’s the top destination for anyone who wants to express the love for books. The largest marketplace with hand-crafted goods offers thousands of literary quotes – on posters, jewelry, personal items, electronic accessories, and clothes."
        );
        JLabel jLabel1 = new JLabel("\nThe site offers a huge variety of merchandise, from clothing, to home decor, to personal accessories. What’s more, users can upload their own image and create their own design.");
        jFrame.add(jLabel);
        jFrame.add(jLabel1);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
