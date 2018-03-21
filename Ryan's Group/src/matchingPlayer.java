public class MatchingPlayer
{
    protected int matches;
    protected int levelsCompleted;
    protected int score;
    public MatchingPlayer()
    {
        matches = 0;
        levelsCompleted = 0;
        score = 0;
    }

    public void setCards(int m)
    {
        m = matches;
    }

    public void setLevel(int l)
    {
        l = levelsCompleted;
    }

    public void setScore(int s)
    {
        s = score;   
    }

    public int getCards()
    {
        return matches;
    }

    public int getLevel()
    {
        return levelsCompleted;
    }

    public int getScore()
    {
        return score;   
    }
}
