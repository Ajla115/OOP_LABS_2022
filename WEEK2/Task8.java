package com.Week2;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    private static int drawNumber(){ //ovo private znaci da se ne moze koristit izvan ovoga fajla
        Random rand = new Random();
        int number = rand.nextInt(101); //ide 0 do 100, zadnji 101 je iskljucen
        return number;
    }

    public static void main(String[] args) {
        int number = drawNumber();
        int countGuess = 0;
        System.out.println("The secret number is " + number);
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Guess a number: ");
            int guess = reader.nextInt();
            countGuess++;
            if (guess > number) {
                System.out.println("The number is lesser.Number of guesses" + countGuess +".");
            } else if (guess < number) {
                System.out.println("The number is greater. Number of guesses " + countGuess + ".");
            } else {
                System.out.println("Congratulations, your guess is correct.");
                break;
            }

        }
    }

}
