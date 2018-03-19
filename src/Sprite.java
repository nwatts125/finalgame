import java.awt.*;

public abstract class Sprite extends EzImage {
    protected int dx, dy;
    protected Rectangle rect;
    
    public Sprite(int deltax, int deltay, String fpath){
        super();
        this.changeImage(fpath);
        dx = deltax;
        dy = deltay;
    }

    public Sprite(){
        super();
    }
    
    public void setLocation(int x, int y)
    {
        super.setLocation(x,y);
        rect.setLocation(x,y);
    }
    
    public void changeImage(String path){
        this.setImage(path);
    }
    
    public void setImageSize(int w, int h){
        setSize(w,h);
        rect.setSize(w,h);
        this.repaint();
    }
    
    public boolean collides(){
        return false;
    }
    
    public abstract void move();

    public Rectangle getRect()
    {
        return rect;
    }

    public boolean collides (Sprite s)
    {
        return rect.intersects(s.getRect());
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
