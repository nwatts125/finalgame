import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UI 
{
    public JFrame win;
    public JButton close;
    public JLabel score;
    public JLabel slot0,slot1,slot2,slot3,slot4,slot5,slot6,slot7,slot8,slot9,slot10;
    public UI()
    {
        //JFrame------------------------------------
        win = new JFrame("Menu");
        win.setLayout(null);
        win.setBounds(0,0,1000,700);
        win.setResizable(false);
        //Close Button------------------------------
        JButton close;
        close = new JButton("X");
        close.setBounds(0,0,25,25);
        close.setFont(new Font("Comic Sans", Font.BOLD, 30));
        close.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //add what is closed
                }
            });
            win.add(close, 0);
        //Score--------------------------------------
        score = new JLabel("OVERALL HIGH SCORE");
        score.setBounds(0,5,150,50);
        score.setFont(new Font("Comic Sans", Font.BOLD, 12));
        win.add(score,0);
        //Slots for Scores---------------------------
        slot0 = new JLabel("Rank   Name   Score");
        slot0.setBounds(0,40,150,10);
        win.add(slot0,0);
        
        slot1 = new JLabel("1.          -------");
        slot1.setBounds(0,80,150,10);
        win.add(slot1,0);
        
        slot2 = new JLabel("2.          -------");
        slot2.setBounds(0,120,150,10);
        win.add(slot2,0);
        
        slot3 = new JLabel("3.          -------");
        slot3.setBounds(0,160,150,10);
        win.add(slot3,0);
        
        slot4 = new JLabel("4.          -------");
        slot4.setBounds(0,200,150,10);
        win.add(slot4,0);
        
        slot5 = new JLabel("5.          -------");
        slot5.setBounds(0,240,150,10);
        win.add(slot5,0);
        
        slot6 = new JLabel("6.          -------");
        slot6.setBounds(0,280,150,10);
        win.add(slot6,0);
        
        slot7 = new JLabel("7.          -------");
        slot7.setBounds(0,320,150,10);
        win.add(slot7,0);
        
        slot8 = new JLabel("8.          -------");
        slot8.setBounds(0,360,150,10);
        win.add(slot8,0);
        
        slot9 = new JLabel("9.          -------");
        slot9.setBounds(0,400,150,10);
        win.add(slot9,0);
        
        slot10 = new JLabel("10.          -------");
        slot10.setBounds(0,440,150,10);
        win.add(slot10,0);
        
        win.setVisible(true); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }
}

