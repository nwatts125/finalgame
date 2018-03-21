import javax.swing.*;

public class GameWindow{
    public static void main(String[]args){
        JFrame win = new JFrame("Game Window");
        Card card = new Card(100,100,100,140);
        win.add(card);
        System.out.println(card.getValue());
        win.setVisible(true);
        win.setBounds(0,0,1000,1000);
        win.repaint();
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
