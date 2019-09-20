package week8;

public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    boolean digit;

    public void setAddress(String address1){
        address = address1;
        for (int i = 0; i < address1.length();i++){
            if(Character.isDigit(address1.charAt(i))){
                digit = true;
            }
        }
        if (digit = true){
            rate = 15;
        }else {
            System.out.println("The address must contain at least one digit");
            rate = 0;
        }
    }
}
