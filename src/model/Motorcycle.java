package model;

/**
 * Created by dmitry on 10.04.17.
 */
public abstract class Motorcycle {
    protected int year;
    protected float capacity;
    protected String name;

    Motorcycle(String name, int year, float capacity){
        this.name = name;
        this.year = year;
        this.capacity = capacity;

    }

    public abstract String getName();
    public abstract float getCapacity();
    public abstract int getYear();

}
