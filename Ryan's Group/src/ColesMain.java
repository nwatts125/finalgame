public class ColesMain {
    private Player CardGamePlayer;
    private Player SpaceInvadersPlayer;
    private Player AdventurePlayer;
    public ColesMain()
    {
        CardGamePlayer = new CardGamePlayer(5,10,15);
        SpaceInvadersPlayer = new SpaceInvadersPlayer(7,11,16);
        AdventurePlayer = new AdventurePlayer(8,12,17);
        System.out.println(CardGamePlayer.getHighScore());
        System.out.println(CardGamePlayer.getScore());
        System.out.println(CardGamePlayer.getLevelsCompleted());
        System.out.println(SpaceInvadersPlayer.getHighScore());
        System.out.println(SpaceInvadersPlayer.getScore());
        System.out.println(SpaceInvadersPlayer.getLevelsCompleted());
        System.out.println(AdventurePlayer.getHighScore());
        System.out.println(AdventurePlayer.getScore());
        System.out.println(AdventurePlayer.getLevelsCompleted());
    }
}
