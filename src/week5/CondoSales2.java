package week5;

import java.util.Scanner;

public class CondoSales2{
    public static void main(String[] args){
        int input;
        int inputB;
        double pkView = 150000;
        double gcView = 170000;
        double lkView = 210000;
        double garage = 5000;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select options 1, 2 or 3: ");
        System.out.println("1 - Park View ");
        System.out.println("2 - Golf Course View ");
        System.out.println("3 - Lake View ");
        input = keyboard.nextInt();

        System.out.println("Please select a parking options 1, 2: ");
        System.out.println("1 - Garage additional $5,000 ");
        System.out.println("2 - Parking Space - Free ");
        inputB = keyboard.nextInt();

        System.out.println("");

        switch (input){

            case 1:
                System.out.println("Park View condos are $"+pkView);
                if (inputB == 1)
                    System.out.println("Garage added: $"+(pkView+garage));
                break;

            case 2:
                System.out.println("Golf Course condos are $"+gcView);
                if (inputB == 1)
                    System.out.println("Garage added: $"+(gcView+garage));
                break;

            case 3:
                System.out.println("Lake View condos are $"+lkView);
                if (inputB == 1)
                    System.out.println("Garage added: $"+(lkView+garage));
                break;

            default:
                System.out.println("You have ENTERED an invalid Option");
                break;

        }
        switch (inputB) {

            case 1:
                System.out.println();
                break;

            case 2:
                System.out.println("A free parking space was added.");
                break;

            default:
                System.out.println("You have ENTERED an invalid Parking Option");
                break;
        }
    }
}