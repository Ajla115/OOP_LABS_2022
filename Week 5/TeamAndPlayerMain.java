package com.Week5;

public class TeamAndPlayerMain {
    public static void main(String[] args) {
        TeamClass sarajevo= new TeamClass("FK Sarajevo");
        System.out.println("Team: " + sarajevo.getName());

        PlayerClass brian = new PlayerClass("Brian");
        PlayerClass pekka = new PlayerClass("Pekka", 39);

        sarajevo.addPlayers(brian);
        sarajevo.addPlayers(pekka);
        sarajevo.addPlayers(new PlayerClass("Mikael", 1)); // works similarly as the above

        sarajevo.printPlayers();

        System.out.println("Total goals: " + sarajevo.goals());
    }
}
