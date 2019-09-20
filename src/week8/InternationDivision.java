package week8;

public class InternationDivision extends Division {
    String divisionLocation;
    String language;

    public InternationDivision(String name, int account, String Location, String lang) {
        super(name, account);
        divisionLocation = Location;
        language = lang;
    }

    @Override
    public void display() {
        System.out.println("Division name: " +divisionName +"\nAcount number: "+accountNumber+"\nLocation: "+divisionLocation + "\nLanguage: "+language);
    }

}
