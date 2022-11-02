package com.Week3;

import java.util.Scanner;

/*T8:  Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).*/
public class Task8 {
    public static void palindrome(String word){
        String reverse = "";
        int i = word.length() - 1;
        while(i >= 0){
            reverse += word.charAt(i);
            i--;
        }

        System.out.println(reverse);
        if(word.equals(reverse)){
            System.out.println("The word is a palindrome.");
        }
        else {
            System.out.println("The word is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = reader.nextLine();
        palindrome(word);

    }
}





