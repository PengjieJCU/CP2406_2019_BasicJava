package week7;

public class Poem {
    String poemName;
    int lineNumber;

    public Poem(String fiPoemName, int fiNumLines)
    {
        poemName = fiPoemName;
        lineNumber = fiNumLines;
    }
    public String getTitle()
    {
        return poemName;
    }
    public int getLines()
    {
        return lineNumber;
    }

}
