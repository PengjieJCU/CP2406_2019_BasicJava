package week5;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        int numberOfMinites;
        int numberOfMessages;
        int numberOfData;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of minutes you want");
        numberOfMinites = input.nextInt();

        System.out.println("Please enter the number of messages you want");
        numberOfMessages = input.nextInt();

        System.out.println("Please enter the amount of gigabyte data you want");
        numberOfData = input.nextInt();

        if (numberOfMinites <= 500 && numberOfMessages == 0) {
            if (numberOfData == 0) {
                System.out.println("You should choose plan A $49");
            }
        } else if (numberOfMinites <= 500 && numberOfMessages < 200) {
            if (numberOfData == 0) {
                System.out.println("You should choose plan B $55");
            }
        } else if (numberOfMinites > 500 && numberOfMessages <= 100) {
            if (numberOfData == 0) {
                System.out.println("You should choose the plan C $61");
            }
        } else if (numberOfMinites > 500 && numberOfMessages > 100) {
            System.out.println("You should choose the plan D $70");
        } else if (numberOfMinites > 500 && numberOfMessages > 100 && numberOfData <= 2) {
            System.out.println("You should choose the plan E $79");
        } else if (numberOfMinites > 500 && numberOfMessages > 100 && numberOfData > 2) {
            System.out.println("You should choose the plan F $87");
        }
        ;
    }
}

