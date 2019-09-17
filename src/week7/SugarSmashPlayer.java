package week7;

public class SugarSmashPlayer
{
    // add private varaibles here
    protected int IDNumber;
    protected String screenName;
    private int levels = 10;
    private int[] scores = new int[levels];

    public SugarSmashPlayer()
    {
        scores = new int[levels];
    }
    public void setIdNumber(int num)
    {
        IDNumber = num;
    }
    public void setName(String player)
    {
        screenName = player;
    }
    public void setScore(int score, int level)
    {
        boolean goodScores = false;

        if (level == 0)
            scores[level] = score;
        else
        {
            if (scores[level - 1] > 100)
                goodScores = true;
            if (goodScores && level < scores.length)
                scores[level] = score;
            else
            {
                System.out.println("\nInvalid score");
            }
        }
    }
    public int getIdNumber()
    {
        return IDNumber;
    }
    public String getName()
    {
        return screenName;
    }
    public int getScore(int level)
    {
        if (level >= scores.length)
        {
            System.out.println("Invalid game level");
            return -1;
        }
        else
            return scores[level];

    }
    public int getMinScore()
    {
        return 100;
    }
    public int getLevels()
    {
        return levels;
    }
}
