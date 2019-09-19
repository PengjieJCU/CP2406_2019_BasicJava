package week7;

public class FixDebugPlay
{
   protected String title;
   protected String author;

   public FixDebugPlay(String title, String author)
   {
      title = title;
      author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}