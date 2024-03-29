package week7;

public class FixDebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public FixDebugCustomer(int id, String name, double credit)
    {
       idNumber = id;
       this.name = name;
       credit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
