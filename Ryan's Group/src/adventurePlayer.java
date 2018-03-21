public class AdventurePlayer
{
    protected int lives;
    protected int items;
    protected int score;
    public AdventurePlayer()
    {
        lives = 3;
        items = 0;
        score = 0;
    }

    public void setLives(int l)
    {
        l = lives;
    }

    public void setItems(int i)
    {
        i = items;
    }

    public void setScore(int s)
    {
        s = score;   
    }

    public int getLives()
    {
        return lives;
    }

    public int getItems()
    {
        return items;
    }

    public int getScore()
    {
        return score;   
    }
}
