package model;

/**
 * Created by dmitry on 10.04.17.
 */
public class Street extends Motorcycle {

    Street(String name, int year, float capacity) {
        super(name, year, capacity);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getCapacity() {
        return capacity;
    }

    @Override
    public int getYear() {
        return year;
    }
}
