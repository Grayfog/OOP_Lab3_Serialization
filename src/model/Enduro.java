package model;

/**
 * Created by dmitry on 10.04.17.
 */
public class Enduro extends OffRoad {
    Enduro(String name, int year, float capacity) {
        super(name, year, capacity);
    }

    public void soud(){
        System.out.print("Wrum-wrum\n");
    }
}
