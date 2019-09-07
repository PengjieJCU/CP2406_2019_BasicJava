package week6;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String firstName;
        String secondName;
        String thirdName;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the fist name: ");
        firstName = input.nextLine();
        System.out.println("Please enter the second name: ");
        secondName = input.nextLine();
        System.out.println("Please enter the third name: ");
        thirdName = input.nextLine();
        System.out.println("Final combination result: ");
        System.out.println(firstName + secondName);
        System.out.println(firstName + thirdName);
        System.out.println(secondName + firstName);
        System.out.println(secondName + thirdName);
        System.out.println(thirdName + firstName);
        System.out.println(thirdName + secondName);

    }

}
