package com.week12.farmsimulator.cows;
/*public Barn(BulkTank tank)
public BulkTank getBulkTank() returns the barn's bulk tank
public void installMilkingRobot(MilkingRobot milkingRobot) installs a milking robot and connects it to the barn bulk tank
public void takeCareOf(Cow cow) milks the parameter cow with the help of the milking robot, the method throws an
IllegalStateException if the milking robot hasn't been installed
public void takeCareOf(Collection<Cow> cows) milks the parameter cows with the help of the milking robot, the method
throws an IllegalStateException if the milking robot hasn't been installed
public String toString() returns the state of the bulk tank contained by the barn*/

import java.util.Collection;

public class Barn {
    private BulkTank bulkTank;
    private MilkingRobots milkingRobot;

    public Barn(BulkTank tank){
        this.bulkTank = tank;
    }

    public BulkTank getBulkTank(){
        return this.bulkTank;
    }

    public void installMilkingRobot(MilkingRobots milkingRobot){
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Cows cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("Install milking robot");
        }

        milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cows> cows){
        if(this.milkingRobot == null){
            throw new IllegalStateException("Install milking robot");
        }

        for(Cows c : cows){
            milkingRobot.milk(c);
        }
    }


    public String toString(){
        return this.bulkTank.toString();
    }
}

