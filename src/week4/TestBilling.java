package week4;

import static org.junit.jupiter.api.Assertions.*;

class TestBilling {
    public static void main(String[] args){
        Billing billing = new Billing();
        double singleParameter = billing.computeBill(50);
        System.out.println("--------------billing 1--------------");
        System.out.println("Price of photobook: " + singleParameter);
        System.out.println("The totcal price is "+ singleParameter);

        double twoParameters = billing.computeBill(50, 10);
        System.out.println("--------------billing 2--------------");
        System.out.println("Price of photobook: " + singleParameter);
        System.out.println("Aount of photobook: 10");
        System.out.println("The total price is " + twoParameters);

        double threeParameters = billing.computeBill(50, 10, 10);
        System.out.println("--------------billing 3--------------");
        System.out.println("Price of photobook: " + singleParameter);
        System.out.println("Aount of photobook: 10");
        System.out.println("Coupon value: 10");
        System.out.println("The total price is " + threeParameters);
    }

}