package com.Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdWatchers {
    private ArrayList<Bird> birds = new ArrayList<Bird>();
    private Scanner reader = new Scanner(System.in);
    
    public void addBird(){
        System.out.println("Name: ");
        String name = this.input();
        System.out.print("Latin Name: ");
        String latinName = this.input();
        this.birds.add(new Bird(name, latinName));
    }
    public void observe(){
        System.out.println("What was observed? ");
        String searched = this.input();
        for(Bird bird : this.birds){
            if(StringUtils.included(bird.getName(), searched) || StringUtils.included(bird.getLatinName(), searched)){
                bird.addObservation();
                return;
            }
        }
        System.out.println("Is Not a Bird!");
    }

    public void statistics(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }

    public void show(){
        System.out.println("What? ");
        String searched = this.input();
        for(Bird bird : this.birds){
            if(StringUtils.included(bird.getName(), searched) || StringUtils.included(bird.getLatinName(), searched)){
                System.out.println(bird);
            }
        }
    }

    public String input(){
        return this.reader.nextLine();
    }
}

