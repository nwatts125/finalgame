 

 

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;

import java.util.TimerTask;
import java.util.Timer;

import java.awt.Component;
public class Golfball extends CollisionObj implements MouseListener {
    int deltaX, deltaY, powerFactor;
    boolean canMove;
    JFrame win;
    //X1 and Y1 is the mousePoint
    int X2, Y2;
    public Golfball(int x, int y, int w, int h, JFrame jf){
        deltaX = 0;
        deltaY = 0;
        powerFactor = 7;
        X2 = 0;
        Y2 = 0;
        canMove = true;
        win = jf;
        setBounds(x, y, w, h);
        setImage("\\images\\GolfBall.png");
    }

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mousePressed(MouseEvent e){}

    public void mouseClicked(MouseEvent e){}

    public void mouseReleased(MouseEvent e){
        X2 = e.getX();
        Y2 = e.getY();
        if(canMove){
            deltaX = getDeltaX()/powerFactor;
            deltaY = getDeltaY()/powerFactor;
            move();
        }
    }

    public void move(){
        if(deltaX <= 0 || deltaY <= 0){
            if(deltaX < 0){
                deltaX++;
            }
            if(deltaY < 0){
                deltaY++;
            }
        }
        if(deltaX >= 0 || deltaY >= 0){
            if(deltaX > 0){
                deltaX--;
            }
            if(deltaY > 0){
                deltaY--;
            }
        }
        if(deltaX == 0 && deltaY == 0){
            canMove = true;
        }
        setAlignmentX(CENTER_ALIGNMENT);
        setAlignmentY(CENTER_ALIGNMENT);
        setLocation(getX() + deltaX, getY()  + deltaY);
        win.repaint();
    }

    //delta Methods
    int getPower(){
        return (int)Math.sqrt(Math.pow(getDeltaX(),2) + Math.pow(getDeltaY(),2));
    }

    int getDeltaX(){
        return getX() + getWidth()/2 - X2;
    }

    int getDeltaY(){
        return getY() + getHeight()/2 - Y2;
    }

    void setDeltaX(int dx){
        deltaX = dx;
    }

    void setDeltaY(int dy){
        deltaY = dy;
    }

    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setBounds(0, 0, 500, 500);
        win.setVisible(true);
        win.setLayout(null);
        Golfball ball = new Golfball(300, 300, 75, 75, win);
        win.add(ball);
        win.addMouseListener(ball);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    ball.move();
                }
            }, 25, 25);
    }
}
