package model.classes;

import java.io.Serializable;

/**
 * Created by dmitry on 10.04.17.
 */
public class Enduro extends OffRoad implements Serializable{

    private String sound;

    public String getSound(){
        return sound;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

}
