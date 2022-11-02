package com.Week3;

import java.util.Scanner;

/*T2: Create a program that asks for the user's
 name and says how many characters the name contains.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = reader.nextLine();
        int length = name.length();
        System.out.println("The number of characters is: " + length);
        //ili samo System.out.println("The number of characters" + name.length());
    }
}
