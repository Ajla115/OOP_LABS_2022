package com.week12.farmsimulator.cows;
/*public MilkingRobot() creates a new milking robot
BulkTank getBulkTank() returns the connected bulk tank, or a null reference, if the tank hasn't been installed
void setBulkTank(BulkTank tank) installs the parameter bulk tank to the milking robot
void milk(Milkable milkable) milks the cow and fills the connected bulk tank; the method returns an IllegalStateException
is no tank has been fixed
 */

public class MilkingRobots implements Milkable{
    private BulkTank bulkTank = null;
    @Override
    public double milk() {
        return 0;
    }

    public MilkingRobots(){
    }

    public BulkTank getBulkTank(){
        return this.bulkTank;
    }

    public void setBulkTank(BulkTank tank){
        this.bulkTank = tank;
    }

    public void milk(Milkable milkable){
        if(this.bulkTank == null){
            throw new IllegalStateException("Connect bulk tank");
        }
        double amountToAdd = milkable.milk();
        bulkTank.addToTank(amountToAdd);
    }

}
