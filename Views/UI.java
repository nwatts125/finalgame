import javax.swing.*;
import java.awt.event.*;

class UI extends JFrame{
  JButton close;
  JComponent game;
  Scoreboard scoreBoard;
  public UI(int x, int y, int w, int h, boolean sb){
    setBounds(x,y,w,h);
    setVisible(true);
    setLayout(null);
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
        setVisible(false);
      }
    });
    add(close,0);
  }
  public void addGameObject(JComponent jc){
    game = jc;
    add(game);
  }
  public Scoreboard getScoreBoard() {
    return scoreBoard;
  }
}
