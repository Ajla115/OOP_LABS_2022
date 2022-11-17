package com.Week5;
/*Implement a class Team. At this stage team has only a name
(String) and the following functionality:ž
a constructor that sets the team name
 getName, which returns the name*/


import java.util.ArrayList;

public class TeamClass {
    private String name;
    private ArrayList<PlayerClass> players;
    private int maxSize = 16;

    public TeamClass(String initialName){
        this.name = initialName;
        this.players = new ArrayList<PlayerClass>();
    }

    public String getName(){
        return this.name;
    }

    public void addPlayers(PlayerClass player){
        if(this.players.size()<this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers(){
        for(PlayerClass player: this.players){
            System.out.println(player);
        }
    }
    public void setMaxSize(int newMaxSize){
        this.maxSize = newMaxSize;
    }

    public int size(){
        return this.players.size();
    }

    public int goals(){
        int totalGoals = 0;

        for(int i = 0; i < players.size(); i++){
            totalGoals = totalGoals + (players.get(i)).getGoals();
        }

        return totalGoals;
    }
}

