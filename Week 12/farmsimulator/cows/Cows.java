package com.week12.farmsimulator.cows;

import java.util.Random;

/* If we want to produce milk, we also need cows. Cows have got names and udders.
 Udder capacity is a random value between 15 and 40; the class Random can be used to raffle off the numbers,
 for instance, int num = 15 + new Random().nextInt(26);. The class Cow has the following functionality:
public Cow() creates a new cow with a random name
public Cow(String name) creates a new cow with its given name
String getName() returns the cow's name
double getCapacity() returns the udder capacity
double getAmount() returns the amount on milk available in the cow's udders
String toString() returns a String which describes the cow (see the example below)*/
public class Cows implements Milkable, Alive{
    private String name;
    private int amount = 0;

    private int capacity;

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",  "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  "Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};



    public Cows(){
        int randomIndex = new Random().nextInt(NAMES.length);
        this.name = NAMES[randomIndex];
        this.capacity = 15 + new Random().nextInt(26);
    }

    public Cows(String name){
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }


    public int getAmount(){
        return this.amount;
    }

    @Override
    public double milk(){
        double keepAmout = this.amount;
        this.amount = 0;
        return keepAmout;
    }
    @Override
    public void liveHour(){
        this.amount += 0.7 + new Random().nextInt(2);
    }

    public String toString(){
        return this.name + " " + this.amount + " / " + this.capacity;
    }
}
