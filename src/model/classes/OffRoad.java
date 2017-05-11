package model;

import javafx.beans.property.StringProperty;

/**
 * Created by dmitry on 10.04.17.
 */
public class OffRoad extends Motorcycle {

    OffRoad(String name, int year, double capacity) {
        super(name, year, capacity);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public StringProperty getNameProperty(){
        nameProperty.setValue(name);
        return nameProperty;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public int getYear() {
        return year;
    }
}
