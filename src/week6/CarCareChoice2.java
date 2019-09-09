package week6;

import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        String userChoice;

        Scanner input = new Scanner(System.in);
        System.out.println("Available services: \n" +
                "O - oil-change\n"+
                "T - tire rotation\n" +
                "BC - battery check\n" +
                "BI - brake inspection\n"+
                "Please choose one otion: ");

        userChoice = input.nextLine().toLowerCase();

        if(userChoice.equals("O")){
            System.out.println("Price is $25.");
        }else if(userChoice.equals("T")){
            System.out.println("Price is $22");
        }else if(userChoice.equals("BC")){
            System.out.println("Price is $15");
        }else if(userChoice.equals("BI")){
            System.out.println("Price is $5");
        }else {
            System.out.println("Invalid entry");

        }
    }
}
