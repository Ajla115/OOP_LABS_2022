package com.Week2;
//Create a method printStars that prints the given amount of stars and a line break.

public class Task7 {
    private static void printStars(int amount){

        int i = 0;
        while(i <= amount){
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
