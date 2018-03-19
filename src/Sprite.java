

public abstract class Sprite extends EzImage {
    protected int dx, dy;
    
    public Sprite(int deltax, int deltay, String fpath){
        super();
        this.changeImage(fpath);
        dx = deltax;
        dy = deltay;
    }
    
    public void setX(int x){
        dx = x;
    }

    public void setY(int y){
        dy = y;
    }
    
    public void changeImage(String path){
        this.setImage(path);
    }
    
    public void setImageSize(){
        this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        this.repaint();
    }
    
    public boolean collides(){
        return false;
    }
    
    public abstract void move();
    
    public static void main(String[] args) {
        System.out.println();
    }
}
