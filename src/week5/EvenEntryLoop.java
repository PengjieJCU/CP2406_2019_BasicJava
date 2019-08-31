package week5;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args){
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an even number or 999 to quit");
        num = input.nextInt();
        while (num != 999){
            if (num % 2 == 0){
                System.out.println("Good Job!");
                break;
            }else {
                System.out.println("It's not an even, Please enter an even number again!");
                num = input.nextInt();
            }
        }
    }
}
