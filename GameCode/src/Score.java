public class Score implements Model{

    private String playerName;
    private int hiScore;

    public Score(String n, int hS){
        playerName = n;
        hiScore = hS;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHiScore() {
        return hiScore;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return ":"+playerName+"-"+hiScore;
    }

    public void setHiScore(int hiScore) {
        this.hiScore = hiScore;
    }

    @Override
    public void saveStrings(String[] s) {

    }

    @Override
    public void saveInts(int[] i) {

    }

    @Override
    public void saveBool(boolean[] b) {

    }

    @Override
    public void saveList(Model[] m) {

    }

    @Override
    public String[] getStrings() {
        return new String[0];
    }

    @Override
    public int[] saveInts() {
        return new int[0];
    }

    @Override
    public boolean[] saveBool() {
        return new boolean[0];
    }

    @Override
    public Model[] saveList() {
        return new Model[0];
    }
}