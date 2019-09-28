package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JPizza extends JFrame implements ItemListener {
    int sizeIndex;
    int toppingIndex;
    int TotalPrice;
    int SizeP;
    int ToppingP;


    JFrame jFrame = new JFrame();
    FlowLayout flowLayout = new FlowLayout();
    JLabel size = new JLabel("Size");
    JLabel topping = new JLabel("Topping");
    JLabel totalPrice = new JLabel("Total price: ");
    JComboBox<String> sizeOptions = new JComboBox<String>();
    JComboBox<String> toppingOption = new JComboBox<String>();
    int[] sizePrice = {0,7,9,11,14};
    int[] toppingPrice = {0,0,1,1,1,1};

    public JPizza(){
        setTitle("Question 5");
        setLayout(flowLayout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);

        add(size);
        add(sizeOptions);
        add(topping);
        add(toppingOption);

        sizeOptions.addItem("Small");
        sizeOptions.addItem("Medium");
        sizeOptions.addItem("Large");
        sizeOptions.addItem("Extra large");

        toppingOption.addItem("Cheese");
        toppingOption.addItem("Sausage");
        toppingOption.addItem("Pepperoni");
        toppingOption.addItem("Tomatoes");
        toppingOption.addItem("Green pepper");

        add(totalPrice);

        sizeOptions.addItemListener(this);
        toppingOption.addItemListener(this);
        pack();
        setVisible(true);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        Object box = e.getSource();
        if (box == sizeOptions){
            sizeIndex = sizeOptions.getSelectedIndex();
            SizeP = sizePrice[sizeIndex];
            TotalPrice = SizeP + ToppingP;
            String showPrice = "Total price is: " + TotalPrice;
            totalPrice.setText(showPrice);
        }else if (box == toppingOption){
            toppingIndex = toppingOption.getSelectedIndex();
            ToppingP = toppingPrice[toppingIndex];
            TotalPrice = SizeP + ToppingP;
            String showPrice = "Total price is: " + TotalPrice;
            totalPrice.setText(showPrice);
        }
    }

    public static void main(String[] args) {
        new JPizza();
    }
}
