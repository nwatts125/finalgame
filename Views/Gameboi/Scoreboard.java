package Views.Gameboi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scoreboard extends JComponent{
    private JLabel[] post = new JLabel[10];
    public Scoreboard(JFrame win){
        super();
        //Score--------------------------------------
        JLabel score = new JLabel("OVERALL HIGH SCORE");
        score.setBounds(0,5,150,50);
        score.setFont(new Font("Comic Sans", Font.BOLD, 12));
        win.add(score,0);
        //Slots for Scores---------------------------
        JLabel header = new JLabel("Rank   Name   Score");
        header.setBounds(0,40,150,10);
        win.add(header,0);
        for(int i = 0; i < post.length; i++){
            post[i] = new JLabel(i + 1 + ".          -------");
            post[i].setBounds(0,(i * 40) + 80,150,10);
            win.add(post[i],0);
        }
    }
}