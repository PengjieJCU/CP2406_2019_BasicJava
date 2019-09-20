package week8;

public abstract class Book {
    String title;
    double bookPrice;

    public Book(String t){
        title = t;
    }

    public String getTitle(){
        return title;
    }

    public double getBookPrice(){
        return bookPrice;
    }

    public abstract void setBookPrice();
}
