package com.Week1;

import java.util.Scanner;

//5. Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else {
            System.out.println("The number " + number + " is negative.");
        }
    }
}
