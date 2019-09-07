package week6;

import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args){
        String movieQuote;
        int amountOfSpaces = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a movie quote: ");
        movieQuote = input.nextLine();

        int length = movieQuote.length();

        for (int i = 0; i < length; i++){
            char achar = movieQuote.charAt(i);
            if(achar == ' '){
                amountOfSpaces++;
            }
        }
        System.out.println("The amount of spaces is " + amountOfSpaces);

    }
}
