public class Player{

    public int topScore;
    public int currentScore;

    public int lives;

    public Player(){
        currentScore = 0;
    }

    public int getTopScore(){
        return topScore;
    }

    public int getScore() {
        return currentScore;
    }

    public int getLives() {
        return lives;
    }

    public void setTopScore(int hiScore) {
        this.topScore = hiScore;
    }

    public void setScore(int score) {
        currentScore = score;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}