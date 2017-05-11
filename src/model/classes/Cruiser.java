package model.classes;

import java.io.Serializable;

/**
 * Created by dmitry on 10.04.17.
 */
public class Cruiser extends Street implements Serializable{

    private boolean bags;


    public boolean getBags(){
        return bags;
    }

    public void setBags(boolean bags){
        this.bags = bags;
    }

}
