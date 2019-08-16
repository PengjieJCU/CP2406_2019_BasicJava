package week3;
import java.util.Scanner;

public class Dollars
{
    public static void main(String[] args)
    {
        int totalDollars;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of dollars that you want to convert");

        totalDollars = input.nextInt();

        int twenties = totalDollars / 20;
        int remainderTwenty = (totalDollars % 20);
        int tens = remainderTwenty / 10;
        int remainderTen = (totalDollars % 10);
        int fives = remainderTen / 5;
        int remainderFive = (totalDollars % 5);
        int ones = remainderFive / 1;
        System.out.println("Total Entered is $" + totalDollars + "\n" + "\nTwenty Dollar Bills: " + twenties + "\nTen Dollar Bills: " + tens + "\nFive Dollar Bills: " + fives + "\nOne Dollar Bills: " + ones);
    }
}