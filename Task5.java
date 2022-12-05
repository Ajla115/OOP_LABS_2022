package com.Week6;
//binary search tasks
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7,8,9,11};
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the value you want to search for: ");
        int val = reader.nextInt();
        boolean result = BinarySearch.search(values, val);
        System.out.println((result? "The value " + val +" is in the array": "The value " + val +" is not in the array" ));
    }

}
