package week7;

public class DemoPoems {
    public static void main(String[] args) {
        Poem poem = new Poem("poem1",20);
        Couplet couplet = new Couplet("Couplet poem",2);
        Limerick limerick = new Limerick("Limerick poem", 5);
        Haiku haiku = new Haiku("Haiku poem",3);

        System.out.println("Poem name: " + poem.getTitle() + "\nNumber of line: " + poem.getLines());
        System.out.println("Couplet name: "+ couplet.poemName+"\nNumber of line: "+couplet.lineNumber);
        System.out.println("Limerick name: " + limerick.poemName + "\nNumber of line: "+limerick.lineNumber);
        System.out.println("Haiku name: "+haiku.poemName + "\nNumber of line: "+haiku.lineNumber);
    }
}
