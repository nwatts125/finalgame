import javax.swing.*;
import java.awt.*;
public class UI
{
    public JFrame win;
    public JButton close;
    public JLabel score;
    public UI()
    {
        win = new JFrame("Menu");
        win.setLayout(null);
        win.setBounds(0,0,1000,700);
        win.setResizable(false);
        JButton close;
        close = new JButton("X");
        close.setBounds(0,0,25,25);
        close.setFont(new Font("Comic Sans", Font.BOLD, 30));
        win.add(close, 0);
        score = new JLabel("SCOREBOARD");
        
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    }

    

