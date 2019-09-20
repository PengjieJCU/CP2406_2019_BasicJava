package week8;

public class OutgoingPhoneCall extends PhoneCall {
    int minite;

    public OutgoingPhoneCall(String phoneNumber, int minites){
        super(phoneNumber);
        minite = minites;
        callPrice = minite * 0.04;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getCallPrice() {
        return callPrice;
    }

    @Override
    public void getCallInformation() {
        System.out.println("Incoming phone number: " + getPhoneNumber() +" The rate per minite is: 0.04"+ "\nThe price is: "+getCallPrice());
    }
}
