package com.Week2;

import java.util.Scanner;

//Create a program that asks the user for the first number and the last number and then prints all numbers between those two.
// Use a while loop.
public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int startNumber = reader.nextInt();
        System.out.print("Enter the end number: ");
        int endNumber = reader.nextInt();
        while(startNumber <= endNumber){
            System.out.println(startNumber);
            startNumber++;
        }
    }



}
