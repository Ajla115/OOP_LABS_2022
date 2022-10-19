package com.Week1;
import java.util.Scanner;

//4. Create a program that asks the user for two integers and then prints their sum.

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner reader = new Scanner(System.in);
        int numberOne = Integer.parseInt(reader.nextLine());
        System.out.println("First number is " + numberOne + ".");

        System.out.print("Enter the second number:  ");
        //Scanner reader2 = new Scanner(System.in); dovoljan je jedan scanner, bez obzira na broj unosa
        int numberTwo = Integer.parseInt(reader.nextLine());
        System.out.println("Second number is " + numberTwo + ".");

        int sum = numberOne + numberTwo;
        System.out.println("The sum of two previous numbers is " + sum + ".");
    }

}
