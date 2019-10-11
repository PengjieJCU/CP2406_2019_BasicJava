package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {
    String text;

    BorderLayout borderLayout = new BorderLayout();
    JButton northB = new JButton("North of Get Out");
    JButton southB = new JButton("South of The Founder");
    JButton eastB = new JButton("East of Eden");
    JButton westB = new JButton("Wast of Deadpool");
    JButton centreB = new JButton("Center of Fury");

    public JMovieFrame(){
        setTitle("Question 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(borderLayout);
        add(northB, BorderLayout.NORTH);
        northB.addActionListener(this);
        add(southB, BorderLayout.SOUTH);
        southB.addActionListener(this);
        add(eastB, BorderLayout.EAST);
        eastB.addActionListener(this);
        add(westB, BorderLayout.WEST);
        westB.addActionListener(this);
        add(centreB, BorderLayout.CENTER);
        centreB.addActionListener(this);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == northB){
            text = northB.getText() + ": 2017, Jordan Peele";
            northB.setText(text);
        }else if (e.getSource() == southB){
            text = southB.getText() + ": 2016, John Lee Hancock";
            southB.setText(text);
        }else if (e.getSource() == westB){
            text = westB.getText() + ": 2016, Tim Miller";
            westB.setText(text);
        }else if (e.getSource() == eastB) {
            text = eastB.getText() + ": 1952, John Steibeck";
            eastB.setText(text);
        }else if (e.getSource() == centreB){
            text = centreB.getText() + ": 2015, Matthew Heineman";
            centreB.setText(text);
        }
    }

    public static void main(String[] args) {
        new JMovieFrame();
    }
}
