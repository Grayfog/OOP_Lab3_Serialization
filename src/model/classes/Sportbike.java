package model.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by dmitry on 10.04.17.
 */

public class Sportbike extends Street implements Serializable{

    private int weight;
    private boolean unidirectionalFlow;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public boolean getFlow(){
        return unidirectionalFlow;
    }

    public void setFlow(boolean unidirectionalFlow){
        this.unidirectionalFlow = unidirectionalFlow;
    }

}
