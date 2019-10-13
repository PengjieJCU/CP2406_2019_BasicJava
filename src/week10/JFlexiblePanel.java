package week10;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JPanel {
    Color backG;
    Color foreG;
    Font font;
    String string;
    JLabel jLabel = new JLabel();
    public JFlexiblePanel(Color background, Color foreground, Font jfont, String str){
        backG = background;
        foreG = foreground;
        font = jfont;
        string = str;
        add(jLabel);
        jLabel.setText(string);
        jLabel.setFont(font);
        setBackground(backG);
        jLabel.setForeground(foreG);

    }
}
