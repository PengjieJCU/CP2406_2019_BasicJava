package week8;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Fiction book");
        System.out.println("The titl of the book is: " + fiction.getTitle()+"\nPrice: "+fiction.getBookPrice());
        NonFiction nonFiction = new NonFiction("NonFiction book");
        System.out.println("The titl of the book is: " + nonFiction.getTitle()+"\nPrice: "+nonFiction.getBookPrice());
    }

}
