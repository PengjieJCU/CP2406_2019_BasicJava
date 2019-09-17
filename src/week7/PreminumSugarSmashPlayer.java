package week7;

public class PreminumSugarSmashPlayer extends SugarSmashPlayer
{
    private int levels = 50;
    private int[] scores = new int[levels];

    public PreminumSugarSmashPlayer()
    {
        scores = new int[levels];
    }
    @Override
    public int getLevels()
    {
        return levels;
    }
}
