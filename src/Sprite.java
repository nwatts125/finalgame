import java.awt.Rectangle;

public abstract class Sprite extends EzImage{

    protected int dx;
    protected int dy;
    protected String filepath;
    protected Rectangle rec;

    public Sprite(int x, int y, int w, int h, int dex, int dey, String fp){
        super(x,y,w,h);
        dx = dex;
        dy = dey;
        filepath = fp;
    }
    public Sprite(){
        super();
        dx = 0;
        dy = 0;
        filepath = "";
    }
    public void setDX(int d){
        dx = d;
    }
    public void setDY(int d){
        dy = d;
    }
    public int getDX(){
        return dx;
    }
    public int getDY(){
        return dy;
    }
    public boolean collides(){
        return false;
    }
    public abstract void move();
}
