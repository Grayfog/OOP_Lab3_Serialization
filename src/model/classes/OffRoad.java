package model.classes;

import java.io.Serializable;

/**
 * Created by dmitry on 10.04.17.
 */
public class OffRoad extends Motorcycle implements Serializable{

    private int hp;

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return hp;
    }
}
