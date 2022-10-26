package com.Week2;

import java.util.Scanner;

//Create a program that reads numbers from the user and prints their sum.
// The program should stop asking for numbers when the user enters the number 0.
public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number: ");
            int read = reader.nextInt();
            // int read = reader.nextInt() je identicno sa int read  = Integer.parseInt(reader.nextLine());
            if (read == 0){
                break;
            }
            sum += read;


            System.out.println("Current sum is:  " + sum + ".");
        }
        System.out.println("The total sum in the end is: " +sum + ".");
    }
}
