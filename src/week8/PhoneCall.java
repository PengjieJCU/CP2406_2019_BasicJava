package week8;

public abstract class PhoneCall {
    String phoneNumber;
    double callPrice;

    public PhoneCall(String number){
        phoneNumber = number;
        callPrice = 0.0;
    }

    public void setCallPrice(double fiCallPrice){
        callPrice = fiCallPrice;
    }

    public abstract String getPhoneNumber();
    public abstract double getCallPrice();
    public abstract void getCallInformation();

}
