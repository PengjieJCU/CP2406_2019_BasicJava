package week6;

import com.company.Main;

import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args){
        String userChoice;

        Scanner input = new Scanner(System.in);
        System.out.println("Available services: \n" +
                "Oil change\n"+
                "Tire rotation\n" +
                "Battery check\n" +
                "Brake inspection\n"+
                "Please choose one otion: ");
        userChoice = input.nextLine().toLowerCase();

        if(userChoice.equals("oil change")){
            System.out.println("Price is $25.");
        }else if(userChoice.equals("tire rotation")){
            System.out.println("Price is $22");
        }else if(userChoice.equals("battery check")){
            System.out.println("Price is $15");
        }else if(userChoice.equals("brake inspection")){
            System.out.println("Price is $5");
        }else {
            System.out.println("Invalid entry");

        }
    }
}
