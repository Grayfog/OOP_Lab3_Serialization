package model.classes;

import java.io.Serializable;

/**
 * Created by dmitry on 10.04.17.
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Motorcycle implements Serializable{
    private int year;
    private double capacity;
    private String name;
    private String classModel;

    public String getName(){
        return name;
    }
    public double getCapacity(){
        return capacity;
    }
    public int getYear(){
        return year;
    }
    public String getClassModel(){
        return classModel;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCapacity(double capacity){
        this.capacity = capacity;
    }
    public void setClassModel(String classModel){
        this.classModel = classModel;
    }
    public void setYear(int year){
        this.year = year;
    }

}
