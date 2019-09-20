package week8;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    boolean sign;

    @Override
    public void setAddress(String address2) {
        address = address2;
        for (int i = 0; i<address2.length(); ++i){
            if (address2.charAt(i)== '@'){
                sign = true;
            }
        }
        if (sign = true){
            rate = 9;
        }else {
            System.out.println("Address must contain at least one '@'");
            rate = 0;
        }
    }
}
