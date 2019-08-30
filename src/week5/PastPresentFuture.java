package week5;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args){
        int month;
        int year;
        int day;
        int currentMonth;
        int currentDay;
        int currentYear;

        LocalDate today = LocalDate.now();
        currentDay = today.getDayOfMonth();
        currentMonth = today.getMonthValue();
        currentYear = today.getYear();


        Scanner input = new Scanner(System.in);
        System.out.println("please enter a month");
        month = input.nextInt();

        System.out.println("Please enter a year");
        year = input.nextInt();

        System.out.println("Please enter a day");
        day = input.nextInt();

        if (year != currentYear){
            System.out.println("Not this year");
        }else if (year == currentYear && month < currentMonth){
            System.out.println("In an earlier month this year");
        }else if (year == currentYear && month > currentMonth ){
            System.out.println("In a later month this year");
        }else if (year == currentYear && month == currentMonth){
            System.out.println("this month");
        }else if (year == currentYear && month == currentMonth && day == currentDay){
            System.out.println("Today!");
        }

    }
}
