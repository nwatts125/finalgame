import javax.swing.*;
import java.awt.event.*;

class UI extends JFrame{
  JButton close;
  JComponent game;
  Scoreboard scoreBoard;
  public UI(boolean sb){
    setBounds(0,0,1000,700);
    setVisible(true);
    setLayout(null);
    setBounds(0,0,1000,700);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Scoreboard
    if(sb){
      scoreBoard = new Scoreboard(this, sb);
      add(scoreBoard);
    }
    //Close Button
    close = new JButton("X");
    close.setBounds(0,0,45,45);
    close.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
    add(close,0);
  }
  public void addGame(JComponent jc){
    game = jc;
    add(game);
  }
  public Scoreboard getScoreBoard() {
    return scoreBoard();
  }

  public static void main(String[] args) {
    UI main = new UI(true);
  }
}
