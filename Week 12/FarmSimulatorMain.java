package com.week12;

import com.week12.farmsimulator.cows.BulkTank;

public class FarmSimulatorMain {
    public static void main(String[] args) {
        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);
    }
}
