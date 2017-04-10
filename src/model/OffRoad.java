package model;

/**
 * Created by dmitry on 10.04.17.
 */
public class OffRoad extends Motorcycle {

    OffRoad(String name, int year, float capacity) {
        super(name, year, capacity);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getCapacity() {
        return 0;
    }

    @Override
    public int getYear() {
        return 0;
    }
}
