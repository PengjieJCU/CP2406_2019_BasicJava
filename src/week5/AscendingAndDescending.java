package week5;

import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int num1=input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the second integer");
        int num2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter the third integer");
        int num3 = input3.nextInt();
        checkorder(num1,num2,num3);
    }


    public static void checkorder(int num1, int num2, int num3){

        System.out.println("display in descending order");
        if (num1 > num2 && num2 > num3){
            System.out.println(num1+ " " + num2 + " " + num3);
        }else if(num1 > num3 && num3 > num2){
            System.out.println(num1 + " " + num3 + " " + num2);
        }else if(num2 > num1 && num1 > num3){
            System.out.println(num2 + " " + num1 + " " + num3);
        }else if(num2 > num3 && num3 > num1){
            System.out.println(num2 + " " + num3 + " " + num1);
        }else if(num3 > num1 && num1 > num2){
            System.out.println(num3 + " " + num1 + " " + num2);
        }else if (num3 > num2 && num2 > num1){
            System.out.println(num3 + " " + num2 + " " + num1);
        }
        System.out.println("display in ascending");
        if (num1 > num2 && num2 > num3){
            System.out.println(num3+ " " + num2 + " " + num1);
        }else if(num1 > num3 && num3 > num2){
            System.out.println(num2 + " " + num3 + " " + num1);
        }else if(num2 > num1 && num1 > num3){
            System.out.println(num3 + " " + num1 + " " + num2);
        }else if(num2 > num3 && num3 > num1){
            System.out.println(num1 + " " + num3 + " " + num2);
        }else if(num3 > num1 && num1 > num2){
            System.out.println(num2 + " " + num1 + " " + num3);
        }else if (num3 > num2 && num2 > num1){
            System.out.println(num1 + " " + num2 + " " + num3);
        }

    }
}
