package week8;

public class DemoPhoneCall {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("123456789");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("987654321",10);
        incomingPhoneCall.getCallInformation();
        outgoingPhoneCall.getCallInformation();
    }
}
