import javax.swing.*;
import java.awt.event.*;

class UI{
  JButton close;
  Scoreboard scoreBoard;
  public UI(boolean sb, JComponent jc){
    //Window
    JFrame win = new JFrame();
    jc.setBounds()
    win.setBounds(0,0,1000,700);
    win.setVisible(true);
    win.setLayout(null);
    win.setBounds(0,0,1000,700);
    win.setResizable(false);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Scoreboard
    if(sb){
      scoreBoard = new Scoreboard(win, sb);
      win.add(scoreBoard);
    }
    //Close Button
    close = new JButton("X");
    close.setBounds(0,0,45,45);
    close.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    win.add(close,0);
  }
  public static void main(String[] args) {
    UI main = new UI(true);
  }
}
