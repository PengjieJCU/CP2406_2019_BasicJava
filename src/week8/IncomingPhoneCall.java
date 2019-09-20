package week8;

public class IncomingPhoneCall extends PhoneCall{
    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        callPrice = 0.02;
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
    public  void getCallInformation() {
        System.out.println("Incoming phone number: " + getPhoneNumber() +" The rate per call is: 0.02"+ "\nThe price is: "+getCallPrice());
    }
}
