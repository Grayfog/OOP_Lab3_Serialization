package model.classes;


import java.io.Serializable;

/**
 * Created by dmitry on 10.04.17.
 */

public class Street extends Motorcycle implements Serializable {

    private int speedLimited;

    public int getSpeedLimited(){
        return speedLimited;
    }

    public void setSpeedLimited(int speedLimited){
        this.speedLimited = speedLimited;
    }

}
