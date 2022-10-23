package com.Week1;
/* 3. Create a program that counts how many seconds there are in a year.
You can assume that a year consists of 365 days
(therefore the year is not a leap year).*/
public class Task3 {
    public static void main(String[] args) {
        int days = 365;
        int seconds = days * 24 * 60 * 60;
        System.out.println("There are " + seconds + " seconds in a year.");
    }

}
//uvijek koristiti camelCase, a ne npr number_of_seconds, vec numberOfSeconds