package com.week12.farmsimulator.cows;

import java.util.LinkedList;

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

        Cows cow = new Cows();
        System.out.println(cow);

        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow);
        Milkable milkingCow = cow;
        milkingCow.milk();

        System.out.println(cow);
        System.out.println("");

        cow = new Cows("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        /*cow.milk();
        System.out.println(cow);*/

        /*MilkingRobots milkingRobot = new MilkingRobots();
        Cows cow3 = new Cows();
        milkingRobot.milk(cow3);*/

        MilkingRobots milkingRobot1 = new MilkingRobots();
        Cows cow1 = new Cows();
        System.out.println("\n");

        BulkTank tank2 = new BulkTank();
        /*milkingRobot.setBulkTank(tank2);
        System.out.println("Bulk tank: " + tank2);*/

        for (int i = 0; i < 2; i++) {
            System.out.println(cow);
            System.out.println("Living..");
            for (int j = 0; j < 5; j++) {
                cow.liveHour();
            }
            System.out.println(cow);

            /*System.out.println("Milking...");
            milkingRobot.milk(cow);
            System.out.println("Bulk tank: " + tank);
            System.out.println("\n");*/
            Barn barn = new Barn(new BulkTank());
            System.out.println("Barn: " + barn);

            MilkingRobots robot = new MilkingRobots();
            barn.installMilkingRobot(robot);

            Cows ammu = new Cows();
            ammu.liveHour();
            ammu.liveHour();

            barn.takeCareOf(ammu);
            System.out.println("Barn: " + barn);

            LinkedList<Cows> cowList = new LinkedList<Cows>();
            cowList.add(ammu);
            cowList.add(new Cows());

            for(Cows cows: cowList) {
                cow.liveHour();
                cow.liveHour();
            }

   barn.takeCareOf(cowList);
   System.out.println("Barn: " + barn);

   Farm farm1 = new Farm("Esko", new Barn(new BulkTank()));
   System.out.println(farm1);

   System.out.println(farm1.getOwner() + " is a tough guy!");


   Farm farm = new Farm("Esko", new Barn(new BulkTank()));

   farm.addCow(new Cows());
   farm.addCow(new Cows());
   farm.addCow(new Cows());

   farm.liveHour();
   farm.liveHour();
   System.out.println(farm);

   farm.manageCows();
   System.out.println(farm);
        }
    }
}
