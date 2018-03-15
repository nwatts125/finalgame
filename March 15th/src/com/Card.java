import javax.swing.*;

public class Card extends JLabel{
    protected int value;
    protected boolean flipped;
    protected String question;
    protected JFrame gWin;
    protected ImageIcon back;
    public Card(String s){
        back = new ImageIcon(s);

    }
    public int getValue(){
        return  value;
    }
    public boolean isFlipped(){
        return flipped;
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
//    public void flip(){
//        gWin.remove(this.back);
//    }

}

