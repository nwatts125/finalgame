import javax.swing.*;

public class Card extends JPanel{
    protected int value;
    protected boolean flipped, matched;
    protected String question;
    protected JLabel gWin;
    protected ImageIcon back;
    public Card(String s){
        JPanel back = new JPanel("");
//         JLabel test = new JLabel("Test");
        JButton back = new JButton("YEET!");
        back.setIcon(new ImageIcon(s));
//        JLabel yeet = new JLabel("Test Text");
//        gWin = new JLabel("Game Window");
        this.add(back);
//        this.setVisible(true);
//        gWin.add(back);
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

