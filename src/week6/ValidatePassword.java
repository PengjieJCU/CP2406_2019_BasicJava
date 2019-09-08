package week6;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args){
        String password;
        int numberOfUpperCase = 0;
        int numberOfLowerCase = 0;
        int numberOfDigital = 0;
        int length;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password that contains at least two uppercase letters, at least two lowercase letter and at least two digits: ");
        password = input.nextLine();
        length = password.length();

        for (int i = 0; i < length; i++){
            char singleWord = password.charAt(i);
            if (Character.isUpperCase(singleWord)){
                numberOfUpperCase++;
            }else if (Character.isLowerCase(singleWord)){
                numberOfLowerCase++;
            }else if  (Character.isDigit(singleWord)){
                numberOfDigital++;
            }
        }
        if (numberOfUpperCase >= 2 && numberOfLowerCase >= 2 && numberOfDigital >= 2){
            System.out.println("Successful!");
        }else if(numberOfUpperCase < 2){
            System.out.println("Please enter at least 2 uppercase");
        }else if(numberOfLowerCase < 2){
            System.out.println("Please enter at least 2 lowercase");
        }else if(numberOfDigital < 2){
            System.out.println("Please enter at lease 2 digtals");
        }

    }
}
