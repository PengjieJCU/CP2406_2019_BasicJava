package week6;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args){
        double enterNum;
        int x= 0;
        double total = 0;
        double average;
        double[] num = new double[20];

        Scanner input = new Scanner(System.in);
        System.out.println("please enter any number of double values up to 20: ");
        enterNum = input.nextDouble();

        while (enterNum != 99999 && num.length > x){
            num[x] = enterNum;
            total += num[x];
            ++x;

            if (x <num.length){
                System.out.println("Enter next number or enter 99999 to quite: ");
                enterNum = input.nextDouble();
            }
        }
        if (x == 0){
            System.out.println("No numbers were entered");
        }else {
            average = total/x;
            System.out.println("You entered " + x + "numbers and average are " + average);
            for (int y = 0; y<x; ++y){
                System.out.println("The distance is " + (num[y] - average));
            }
        }
    }
}
