import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Card extends JComponent implements MouseListener{
    protected int value;
    protected boolean flipped, matched;
    protected String question;
    protected JLabel gWin;
    protected ImagePanel back;
    protected JTextArea Inquiry;
    public Card(int x, int y, int w, int h){
        this.setBounds(x,y,w,h);
        back = new ImagePanel(x,y,w,h,"back.png");
        this.add(back);
        Inquiry = new JTextArea(getQuestion());
        Inquiry.setVisible(false);
        Inquiry.setLineWrap(true);
        this.add(Inquiry);
        addMouseListener(this);

    }
    public int getValue(){
        return  value;
    }
    public boolean isFlipped(){
        return flipped;
    }
    public void getFlipped(){
        this.flipped = !this.flipped;
    }
    public int setValue(int s){
        value = s;
        return value;
    }
    public String getQuestion(){
        return question;
    }
    public void setQuestion(String q){
        question = q;
    }
    public void remove(){
        gWin.remove(this);
        gWin.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.back.isVisible()) {
            back.setVisible(false);
            this.getFlipped();
        }
        else if (this.Inquiry.isVisible()){
            Inquiry.setVisible(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

