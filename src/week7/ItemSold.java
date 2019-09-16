package week7;

public class ItemSold {
    int invoiceNumber;
    String description;
    int price;

    public int getInvoiceNumber()
    {
        return invoiceNumber;
    }
    public String getDescription()
    {
        return description;
    }
    public double getPrice()
    {
        return price;
    }

    public void setInvoiceNumber(int fiInvoiceNumber){
        invoiceNumber = fiInvoiceNumber;
    }

    public void setDescription(String fiDescription){
        description = fiDescription;
    }

    public void setPrice(int fiPrice){
        price = fiPrice;
    }
}
