package com.Week8;
/*b) Create the class box, which has to store Things that implement the interface ToBeStored.
 The box receives as constructor the maximum weight, expressed in kilograms. The box can't be added more things
 than its maximum capacity allows for. The weight of the things contained in the box can never exceed the box maximum
  capacity.
 */

import java.util.ArrayList;

public class Box {
    private ArrayList<ToBeStored> things;
    private double maximumWeight;

    public Box(double maximumWeight){
        this.things = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void add(ToBeStored thing){
        if(this.totalWeight() > this.maximumWeight){
            System.out.println("Box is full.");
        } else {
            this.things.add(thing);
        }
    }

    public double totalWeight(){
        double total = 0.0;
        for(ToBeStored toBeStored : things){
            total += toBeStored.weight();
        }
        return total;
    }

    public String toString(){
        return "Number of things " + this.things.size() + " total weight " + this.totalWeight();
    }

}
