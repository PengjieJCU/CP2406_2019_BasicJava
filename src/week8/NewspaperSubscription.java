package week8;

public abstract class NewspaperSubscription {
    String subscriberName;
    String address;
    int rate;

    public String getSubscriberName() {
        return subscriberName;
    }

    public String getAddress() {
        return address;
    }

    public double getRate(){
        return rate;
    }

    public void setSubscriberName(String name){
        subscriberName = name;
    }

    public abstract void setAddress(String address1);

    public void setRate(int rate1) {
        rate = rate1;
    }
}
