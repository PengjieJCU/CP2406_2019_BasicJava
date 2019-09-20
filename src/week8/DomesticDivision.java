package week8;

public class DomesticDivision extends Division {
    String locatedState;

    public DomesticDivision(String name, int account, String State){
        super(name,account);
        locatedState = State;
    }

    @Override
    public void display() {
        System.out.println("Division name: " + divisionName + "\nAccount number: "+accountNumber+"\nLocated state: "+ locatedState);
    }
}
