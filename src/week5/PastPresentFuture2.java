package week5;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args){
        int month;
        int year;
        int day;
        int currentMonth;
        int currentDay;
        int currentYear;
        boolean past;

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



    }
}
