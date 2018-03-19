import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
        close.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //add what is closed
                }
            });
            win.add(close, 0);
        
        score = new JLabel("OVERALL HIGH SCORE");
        score.setBounds(0,5,150,50);
        score.setFont(new Font("Comic Sans", Font.BOLD, 12));
        win.add(score,0);
        win.setVisible(true); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

