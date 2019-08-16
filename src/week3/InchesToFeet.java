package week3;

import java.math.BigDecimal;

public class InchesToFeet {
    public static void main(String[] args){
        double length = 86;
        double inches;
        double feet;
        double decimalPart;
        int integerPart;


        feet = length / 12; //calculate the value of feet
        integerPart = (int)feet; //take the integer part of the value of feet
        BigDecimal b1 = new BigDecimal(feet);
        BigDecimal b2 = new BigDecimal(integerPart);
        decimalPart = b1.subtract(b2).doubleValue(); //take the decimal part of the value of feet

        inches = decimalPart * 12; //calculate the inches value using the decimal part of feet

        System.out.println(length + " inches becomes " + integerPart + " feet and " + inches + " inches");

    }

}
