package com.Week2;

import java.util.Scanner;

//Create a program that asks the user for three numbers and
// then prints their sum.
public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("The first value of a number is: ");
        int read  = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.print("The second value of a number is: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.print("The third value of a number is: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("The value of sum is: " + sum);
    }
}
