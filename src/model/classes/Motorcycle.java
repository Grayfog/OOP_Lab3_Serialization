package model;

import javafx.beans.property.StringProperty;

import java.io.Serializable;

/**
 * Created by dmitry on 10.04.17.
 */
public abstract class Motorcycle implements Serializable {
    protected int year;
    protected double capacity;
    protected String name;
    protected StringProperty nameProperty;

    public Motorcycle(String name, int year, double capacity){
        this.name = name;
        this.year = year;
        this.capacity = capacity;

    }

    public abstract String getName();
    public abstract double getCapacity();
    public abstract int getYear();
    public abstract StringProperty getNameProperty();

}
