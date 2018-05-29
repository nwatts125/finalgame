package bubbleTanks;

import shared.Sprite;

public class Coin extends Sprite {

    public Coin(int x, int y, int w, int h){
        super(x,y,w,h, "src/images/Coin.png");
    }



    //DO NOT CALL. COINS SHOULD NOT MOVE
    @Override
    public void move(){

    }
}
