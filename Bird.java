package com.Week6;

public class Bird {
    private String name;
    private String latinName;
    private int observations = 0;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public void addObservation(){
        this.observations += 1;
    }

    public String toString(){
        return this.name + "( " + this.latinName + ")" + ":" + this.observations + "observations";
    }
}
