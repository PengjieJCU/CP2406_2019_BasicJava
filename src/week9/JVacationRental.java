package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JVacationRental extends JFrame implements ItemListener {
    int totalPrice = 0;

    FlowLayout flowLayout = new FlowLayout();

    ButtonGroup location = new ButtonGroup();
    JCheckBox parkSide = new JCheckBox("Park side");
    JCheckBox poolSide = new JCheckBox("Pool side");
    JCheckBox lakeSide = new JCheckBox("Lake side");

    ButtonGroup numOfBedroom = new ButtonGroup();
    JCheckBox oneBedroom = new JCheckBox("One bedroom");
    JCheckBox twoBedroom = new JCheckBox("Two bedroom");
    JCheckBox threeBedroom = new JCheckBox("Three bedroom");

    ButtonGroup meals = new ButtonGroup();
    JCheckBox includeMeals = new JCheckBox("Include meals");
    JCheckBox noMeals = new JCheckBox("Not include meals");
    JLabel JtotalPrice = new JLabel("Total price is: ");

    public JVacationRental(){
        setTitle("Question 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        setSize(600,500);
        location.add(parkSide);
        location.add(poolSide);
        location.add(lakeSide);
        parkSide.addItemListener(this);
        poolSide.addItemListener(this);
        lakeSide.addItemListener(this);
        add(parkSide);
        add(poolSide);
        add(lakeSide);

        numOfBedroom.add(oneBedroom);
        numOfBedroom.add(threeBedroom);
        numOfBedroom.add(twoBedroom);
        oneBedroom.addItemListener(this);
        twoBedroom.addItemListener(this);
        threeBedroom.addItemListener(this);
        add(oneBedroom);
        add(threeBedroom);
        add(twoBedroom);

        meals.add(includeMeals);
        meals.add(noMeals);
        includeMeals.addItemListener(this);
        noMeals.addItemListener(this);
        add(includeMeals);
        add(noMeals);
        add(JtotalPrice);

        pack();
        setVisible(true);

        }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object box = e.getItem();
        int select = e.getStateChange();
        if (box == parkSide){
            if (select == ItemEvent.SELECTED){
                totalPrice = totalPrice + 600;
            }else if(select == ItemEvent.DESELECTED){
                totalPrice = totalPrice - 600;}
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }else if(box == poolSide){
            if (select == ItemEvent.SELECTED){
                totalPrice = totalPrice + 750;
            }else if (select == ItemEvent.DESELECTED){
                totalPrice = totalPrice - 750;
            }
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }else if(box == lakeSide){
            if (select == ItemEvent.SELECTED){
                totalPrice = totalPrice + 825;
            }else if (select == ItemEvent.DESELECTED){
                totalPrice = totalPrice - 825;
            }
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }else if (box == oneBedroom){
            if(select == ItemEvent.SELECTED){
                totalPrice = totalPrice + 0;
            }else if(select == ItemEvent.DESELECTED){
                totalPrice = totalPrice - 0;
            }
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }else if (box == twoBedroom){
            if (select == ItemEvent.SELECTED){
                totalPrice = totalPrice + 75;
            }else if (select == ItemEvent.DESELECTED){
                totalPrice = totalPrice - 75;
            }
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }else if (box == threeBedroom){
            if (select ==ItemEvent.SELECTED){
                totalPrice = totalPrice + 150;
            }else if(select == ItemEvent.DESELECTED){
                totalPrice = totalPrice - 150;
            }
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }else if (box == includeMeals){
            if (select == ItemEvent.SELECTED){
                totalPrice = totalPrice + 200;
            }else if (select == ItemEvent.SELECTED){
                totalPrice = totalPrice - 200;
            }
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }else if (box == noMeals){
            if (select == ItemEvent.SELECTED){
                totalPrice = totalPrice - 200;
            }else if(select == ItemEvent.DESELECTED){
                totalPrice = totalPrice - 0;
            }
            String showPrice = "Total price is: $" + totalPrice;
            JtotalPrice.setText(showPrice);
        }
    }

    public static void main(String[] args) {
        new JVacationRental();
    }

}
