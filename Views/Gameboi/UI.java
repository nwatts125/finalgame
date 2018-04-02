package Views.Gameboi;

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
        win.add(new Scoreboard(win));
        win.setVisible(true); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }
}

