package com.week12.farmsimulator.cows;
/* Bulk Tank: Milk has to be stored in bulk tanks in good conditions. Bulk tanks are produced both with a standard
capacity of 2000 liters, and with customer specific capacity. Create the class BulkTank, with the following constructors
and methods.
public BulkTank()
public BulkTank(double capacity)
public double getCapacity()
public double getVolume()
public double howMuchFreeSpace()
public void addToTank(double amount) adds to the tank only as much milk as it fits; the additional milk will not be added,
 and you don't have to worry about a situation where the milk spills over
public double getFromTank(double amount) takes the required amount from the tank, or as much as there is left
Also, implement the toString method for your BulkTank. The toString method describes the tank situation by rounding down
the liters using the ceil() method of class Math.
 */

public class BulkTank {
    private double capacity;
    private double volume;


    public BulkTank(){
        this.capacity = 0.0;
        this.volume = 2000;
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 2000;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getVolume(){
        return this.volume;
    }

    public double howMuchFreeSpace(){
        double result = this.volume - getCapacity();
        return result;
    }

    public void addToTank(double amount){
        if(this.volume - getCapacity() >= amount){
            this.capacity += amount;
        } else {
            this.capacity += this.volume - this.capacity;
        }
    }

    public double getFromTank(double amount){
        if(this.capacity >= amount){
            this.capacity -= amount;
        }
        return this.capacity;
    }

    public String toString(){
        return Math.ceil(this.capacity) + "/" + Math.ceil(this.volume);
    }
}
