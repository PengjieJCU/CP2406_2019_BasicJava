package week5;

import java.util.Scanner;

public class EvenOld {
    public static void main(String[] args){
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer number");
        num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
}
