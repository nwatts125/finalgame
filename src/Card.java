import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

public class Card extends JComponent implements MouseListener{
    protected int value;
    protected boolean flipped, matched;
    protected String question;
    protected JLabel gWin;
    protected ImagePanel back;
    protected ImagePanel Shape;
    public Card(int x, int y, int w, int h, String q){
        this.setBounds(x,y,w,h);
        question = q;
        matched=false;

        back = new ImagePanel(0,0,w,h,"back.png");
        back.setVisible(true);
        this.add(back);

        Shape = new ImagePanel(0,0,w,h,q) ;
        Shape.setVisible(false);
        Shape.setBounds(x,y,w,h);
        this.add(Shape,0);

        addMouseListener(this);
    }
    public Card(int x, int y, int w, int h, String q, String pic, int s){
        this.setBounds(x,y,w,h);
        question = q;
        matched=false;

        back = new ImagePanel(0,0,w,h,"back.png");
        back.setVisible(true);
        this.add(back);

        Shape = new ImagePanel(0,0,w,h,pic) ;
        Shape.setVisible(false);
        Shape.setBounds(x,y,w,h);
        this.add(Shape,0);

        setValue(s);
        addMouseListener(this);
    }
    //Returns Value
    public int getValue(){
        return  value;
    }
    //Return a boolean that states whether card is flipped
    public boolean isFlipped(){
        return flipped;
    }
    //Flips card
    public void getFlipped(){
        this.flipped = !this.flipped;
    }
    //Allows change of Value
    public int setValue(int s){
        value = s;
        return value;
    }
    //Returns the String in the ImagePanel
    public String getQuestion(){
        return question;
    }
    //allows for the changed value of match
    public void setMatched(boolean b)
    {
        matched=b;
    }
    //returns matched
    public boolean getMatched()
    {
        return matched;
    }
    //Allows the text in the ImagePanel to be changed
    public void setQuestion(String q){
        question = q;
    }
    //
    public void reset(ArrayList <Card> whatever) {
        for (Card c : whatever) {
            if ((c.flipped)&&(!matched)) {
                back.setVisible(true);
                Shape.setVisible(false);
                c.flipped = false;
            }
        }
    }
    public void resetAll(ArrayList<Card> whatever){
        for(int i = 0; i<whatever.size(); i++){
            Shape.setVisible(false);
            back.setVisible(true);
        }
        //arbitrary array list name[i].flipped = false;
    }
    //What happens when you click the JComponent
    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.back.isVisible()) {
            back.setVisible(false);
            Shape.setVisible(true);
            this.getFlipped();
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
