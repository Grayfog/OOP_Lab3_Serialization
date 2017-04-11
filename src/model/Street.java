package model;

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

    public int getSpeedLimited(){
        return speedLimited;
    }

    public void setSpeedLimited(int speedLimited){
        this.speedLimited = speedLimited;
    }

}
