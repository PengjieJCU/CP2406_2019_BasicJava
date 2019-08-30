package week5;

import java.util.Scanner;

public class CandoSales {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one condominium below!");
        System.out.println("1 - Park view\n" + "2 - Golf cource view\n" + "3 - Lake view");
        int num = input.nextInt();
        showDetails(num);
    }

    private static void showDetails(int num) {
        if (num == 1){
            System.out.println("Type: Park view\n" + "Price: $150000");
        }else if(num == 2){
            System.out.println("Type: Golf cource view\n" + "Price: $170000");
        }else if(num == 3){
            System.out.println("Type: Lake view\n" + "Price: $210000");
        }else {
            System.out.println("Invalid number, $0");
        }

    }
}
