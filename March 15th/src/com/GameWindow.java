import javax.swing.*;

public class GameWindow{
    public static void main(String[]args){
        JFrame win = new JFrame("Game Window");
        Card card = new Card("back.png");
        win.add(card);
        win.setVisible(true);
    }
}
