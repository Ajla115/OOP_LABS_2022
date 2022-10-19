package com.Week1;

import java.util.Scanner;

/* 6. Create a program that asks the user for two numbers and prints the greater of those two.
The program should also handle the case in which the two numbers are equal.*/

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Check which number is greater.");

        Scanner reader = new Scanner(System.in);

        System.err.println("Enter the first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.err.println("Enter the second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        System.out.println("The first number is " + numberOne + ".");
        System.out.println("The second number is  " + numberTwo + ".");

        if(numberOne> numberTwo){
            System.out.println("Number " + numberOne + "is greater than " + numberTwo + "." );
        }
        else if( numberOne == numberTwo){
            System.out.println("Numbers are equal. Numbers are " + numberOne + " and " + numberTwo + ".");
        }
        else { //ovdje moze i else if na kraju i nece biti problema
            System.out.println("Number " + numberTwo + " is bigger than " + numberOne + ".");
        }

    }
}
