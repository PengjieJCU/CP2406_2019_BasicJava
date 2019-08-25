package week4;

import org.junit.jupiter.api.Test;

public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double monthlyAmount;
    private int termsOfLease;
    private final double petFee = 10.0;

    public Lease(){
        tenantName = "Jerry";
        apartmentNumber = 05;
        monthlyAmount = 640;
        termsOfLease = 12;
    }

    public void setTenantName(String Tname){
        tenantName = Tname;
    }

    public void setApartmentNumber(int Anumber){
        apartmentNumber = Anumber;
    }

    public void setMonthlyAmount(double Maount){
        monthlyAmount = Maount;
    }

    public void setTermsOfLease(int TL){
        termsOfLease = TL;
    }

    public String getTenantName(){
        return tenantName;
    }

    public int getApartmentNumber(){
        return apartmentNumber;
    }

    public double getMonthlyAmount(){
        return monthlyAmount;
    }

    public int getTermsOfLease(){
        return termsOfLease;
    }

    public void addPetFee(){
        double finalRent = monthlyAmount + petFee;
        System.out.println("Your final monthly rent is " + finalRent);
        explainPetPolicy();
    }

    public static String explainPetPolicy(){
        String policy = "Because you have a pet, we will add $10 pet fee to your monthly rent!";
        System.out.println(policy);
        return policy;
    }
}
