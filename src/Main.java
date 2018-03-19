public class Main
{
    public static void main(String[]args)
    {
        Sprite sprite = new Sprite() {
            @Override
            public void move() {

            }
        };

        sprite.changeImage("movinglog.png");
        System.out.println(sprite.getImageWidth());
    }
}