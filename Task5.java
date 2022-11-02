package com.Week3;

import java.util.Scanner;

/*T5:Create a program that asks the user for two words.
 Then the program tells if the second word is included in the first word.
 Use the String method indexOf in your program.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String first = reader.nextLine();

        System.out.println("Type the second word: ");
        String second = reader.nextLine();

        if(first.indexOf(second) > 0){
            //if the index value is 0 or bigger, it means that it exists somewehere in that word, if it was not in that word, then index value would be -1
            System.out.println("The word contains: " + second);
        }
        else {
            System.out.println("Does not contain.");
        }
    }
}
