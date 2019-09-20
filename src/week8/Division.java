package week8;

public abstract class Division {
    String divisionName;
    int accountNumber;

    public Division(String name, int account){
        divisionName = name;
        accountNumber = account;
    }
    public abstract void display();
}
