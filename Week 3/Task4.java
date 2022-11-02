package com.Week3;

import java.util.Scanner;
/*T4: Create a program that asks for the user's name and prints it in reverse order. You do not need to create a separate method for this.*/
public class Task4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = reader.nextLine();
        String reverse = " ";
        int i = name.length() - 1;
        while(i >= 0){
            reverse += name.charAt(i);
            i--;
        }
        System.out.println("Reverse order of " + name + " is " + reverse + ".");

    }
}
