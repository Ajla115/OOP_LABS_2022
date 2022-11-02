package com.Week3;
import java.util.Scanner;

/*T3:Create a program that asks for the user's
name and gives its characters separately.
You do not need to create methods in this exercise.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = reader.nextLine();
        int counter = 0;
        int size = name.length()-1;
        //don't forget -1 in order to reach the last index, length() is always longer for one number of character which does not exist while indexing
        int i = 0;
        while (i <= size) {
            counter++;
            System.out.println(counter + ". character: " + name.charAt(i));
            i++;
        }
    }
}

/*for(int i = 0; i < name.length() - 1 ; i++){
    System.out.println((i+1) + "character" + name.charAt(i));
        }*/

