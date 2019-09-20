package week8;

public class DemoSubscription {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalNewspaperSubscription = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onlineNewspaperSubscription = new OnlineNewspaperSubscription();

        physicalNewspaperSubscription.setSubscriberName("Pengjie");
        physicalNewspaperSubscription.setAddress("ashoh7kakjksj");
        onlineNewspaperSubscription.setSubscriberName("Jerry");
        onlineNewspaperSubscription.setAddress("sakjbjdjka@");

        System.out.println("Subscriber(physical) name: " + physicalNewspaperSubscription.getSubscriberName()+"\nAddress: " + physicalNewspaperSubscription.getAddress());
        System.out.println("Subscriber(online name: " + onlineNewspaperSubscription.getSubscriberName()+"\nAddress: "+onlineNewspaperSubscription.getAddress());
    }
}
