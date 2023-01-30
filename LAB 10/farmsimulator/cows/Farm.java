package com.week12.farmsimulator.cows;

import java.util.LinkedList;

/* Farms have got an owner, a barn and a herd of cows.
Farm also implements our old interface Alive: calling the method liveHour makes all the cows of the farm live
for an hour. You also have to create a method manageCows which calls Barn's method takeCareOf so that all cows are milked
 */
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private LinkedList<Cows> cowList;

    public Farm(String o, Barn b){
        this.owner = o;
        this.barn = b;
        this.cowList = new LinkedList<Cows>();
    }

    public String getOwner(){
        return this.owner;
    }

    public String toString(){
        String returnString = "";
        for(Cows cow : this.cowList){
            returnString += "\t" + cow.toString() + "\n";
        }
        return "Farm owner " + this.owner + "\nBarn bulk tank " + this.barn.toString()
                + "\nAnimals:" + "\n" + returnString;
    }

    public void addCow(Cows cow){
        this.cowList.add(cow);
    }

    public void liveHour(){
        for(Cows cow : this.cowList){
            cow.liveHour();
        }
    }

    public void manageCows(){
        this.barn.takeCareOf(cowList);
    }

    public void installMilkingRobot(MilkingRobots robot){
        this.barn.installMilkingRobot(robot);
    }
}

