package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCapital extends JFrame implements ItemListener {
    int countryIndex;
    String[] capitals = {"BeiJin","Canberra","Ottawa","Tokyo","Washington","Hanoi","Kuala Lumpur"};
    String[] countries = {"China", "Australia", "Canada", "Japan", "U.S", "Vietnam", "Malaysia"};

    JFrame jFrame = new JFrame();
    FlowLayout flowLayout = new FlowLayout();
    JLabel options = new JLabel("Select a country");
    JLabel showCapital = new JLabel("The capital is: BeiJin");
    JComboBox<String> Country = new JComboBox<String>();

    public JCapital(){
        setTitle("Question 7");
        setLayout(flowLayout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);

        add(options);
        add(Country);
        Country.addItem("China");
        Country.addItem("Australia");
        Country.addItem("Canada");
        Country.addItem("Japan");
        Country.addItem("U.S");
        Country.addItem("Vietnam");
        Country.addItem("Malaysia");
        add(showCapital);
        Country.addItemListener(this);

        pack();
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object box = e.getSource();
        if (box == Country){
            countryIndex = Country.getSelectedIndex();
            String capital = capitals[countryIndex];
            String shCapital = "The capital is: " + capital;
            showCapital.setText(shCapital);
        }
    }

    public static void main(String[] args) {
        new JCapital();
    }
}
