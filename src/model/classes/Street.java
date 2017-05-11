package model;

import javafx.beans.property.StringProperty;

/**
 * Created by dmitry on 10.04.17.
 */
public class Street extends Motorcycle {

    private int speedLimited;

    Street(String name, int year, double capacity) {
        super(name, year, capacity);
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public StringProperty getNameProperty() {
        nameProperty.setValue(name);
        return nameProperty;
    }

    public int getSpeedLimited(){
        return speedLimited;
    }

    public void setSpeedLimited(int speedLimited){
        this.speedLimited = speedLimited;
    }

}
