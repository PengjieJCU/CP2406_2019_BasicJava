package week5;

import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args){
        int firstInteger;
        int secondInteger;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        firstInteger = input.nextInt();
        System.out.println("Please enter the second integer");
        secondInteger = input.nextInt();

        if (firstInteger - secondInteger <= 1 && secondInteger - firstInteger <= 1){
            System.out.println("There are no integer between the " + firstInteger + "and "+ secondInteger );
        }else if (firstInteger > secondInteger){
            for ( int i = secondInteger + 1; i < firstInteger; ++i){
                System.out.println(i);
            }

        }else if (firstInteger < secondInteger){
            for (int i = firstInteger + 1; i < secondInteger; ++i){
                System.out.println(i);
            }
        }

    }
}
