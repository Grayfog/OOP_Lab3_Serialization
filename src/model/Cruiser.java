package model;

/**
 * Created by dmitry on 10.04.17.
 */
public class Cruiser extends Street {

    private boolean bags;

    Cruiser(String name, int year, float capacity) {
        super(name, year, capacity);
    }

    public boolean isBags(){
        return bags;
    }

    public void setBags(boolean bags){
        this.bags = bags;
    }
}
