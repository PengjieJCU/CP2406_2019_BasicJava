package week8;

public class BookArray {
    public static void main(String[] args) {
        Book books[] = new Book[10];
        books[0] = new Fiction("Fiction book 1");
        books[1] = new NonFiction("NonFiction book 2");
        books[2] = new Fiction("Fiction book 3");
        books[3] = new NonFiction("NonFiction book 4");
        books[4] = new Fiction("Fiction book 5");
        books[5] = new NonFiction("NonFiction book 6");
        books[6] = new Fiction("Fiction book 7");
        books[7] = new NonFiction("NonFiction book 8");
        books[8] = new Fiction("Fiction book 9");
        books[9] = new NonFiction("NonFiction book 10");

        for (int x = 0; x<books.length; ++x){
            System.out.println("Book: "+books[x].getTitle()+" Book price: "+books[x].getBookPrice());
        }
    }
}
