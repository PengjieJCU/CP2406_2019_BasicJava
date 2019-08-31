package week5;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args){
        int countBy;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to count by");
        countBy = input.nextInt();

        for (int i = countBy; i <= 300; i += countBy){
            System.out.println(i + "");
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }
}
