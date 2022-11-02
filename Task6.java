package com.Week3;
/*Create a program that asks the user to
input words until the user gives the same word twice. Use an ArrayList structure in your program.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Add elements to the list: ");
            String element = reader.nextLine();
            words.add(element);

            if (Collections.frequency(words, element) >= 2) {
                System.out.println("You gave the word " + element + " twice.");
                break;
            }
        }
        Collections.sort(words);
        int i = 1;
        System.out.println("\nElements of the list in the alphabetical order: ");
        for (String individual : words) {
                System.out.println(i + ". element of the list is: " + individual);
                i++;
            }

        }

    }

