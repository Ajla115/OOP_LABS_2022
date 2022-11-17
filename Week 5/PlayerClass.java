package com.Week5;

import java.util.ArrayList;

/*Create a class Player with the instance variables for the
 player name and the number of goals. A player should have
  two constructors: one that initializes the name and another
  that initializes the name and the number of goals. Implement
  also the following methods:
getName, returns the player's name
getGoals, returns the number of goals
toString, returns a string representation that is formed as
in the example below
 */
public class PlayerClass {
    private String name;
    private int numberOfGoals;

    public PlayerClass(String initialName){
        this.name = initialName;
    }

    public PlayerClass(String initialName, int amountOfGoals){
        this.name = initialName;
        this.numberOfGoals = amountOfGoals;
    }

    public String getName(){
        return this.name;
    }

    public int getGoals(){
        return this.numberOfGoals;
    }
    public String toString(){
        return this.name + ": " + this.numberOfGoals;

    }
}
