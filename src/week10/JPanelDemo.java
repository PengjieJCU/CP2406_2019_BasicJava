package week10;

import com.company.Main;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    JFlexiblePanel panel1 = new JFlexiblePanel(Color.RED, Color.YELLOW, new Font("Arial",Font.PLAIN, 12), "Java Java");
    Container container;
    public JPanelDemo(){
        container = this.getContentPane();
        container.setLayout(new GridLayout(1,0));
        container.add(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
