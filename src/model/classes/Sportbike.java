package model;

import javafx.beans.property.StringProperty;

/**
 * Created by dmitry on 10.04.17.
 */
public class Sportbike extends Street {

    private int weight;
    private boolean unidirectionalFlow;

    public Sportbike(String name, int year, double capacity) {
        super(name, year, capacity);
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public boolean isFlow(){
        return unidirectionalFlow;
    }

    public void setFlow(boolean unidirectionalFlow){
        this.unidirectionalFlow = unidirectionalFlow;
    }

}
