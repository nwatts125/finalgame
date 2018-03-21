public class SpacePlayer
{
    protected int lives;
    protected int wave;
    protected int score;
    public SpacePlayer()
    {
        lives = 3;
        wave = 0;
        score = 0;
    }

    public void setLives(int l)
    {
        l = lives;
    }

    public void setWave(int w)
    {
        w = wave;
    }

    public void setScore(int s)
    {
        s = score;   
    }

    public int getLives()
    {
        return lives;
    }

    public int getWave()
    {
        return wave;
    }

    public int getScore()
    {
        return score;   
    }
}