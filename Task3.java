package com.Week6;
/*Implement a method indexOfTheSmallestStartingFrom, which works just like the method of the
 previous assignment, but only takes into consideration the end of an array starting from a certain index.
  In addition to the array the method gets as parameter an index, from which the search for the smallest will be started.
 */

public class Task3 {
    public static void main(String[] args) {
        int[] niz = {4,5,6,7,8,89,3,2,1,4,5,9};
        System.out.println(indexOfTheSmallestStartingFrom(niz, 4));
    }

    public static int indexOfTheSmallestStartingFrom(int[] arr, int index){
        int smallestIndex = index;
        for(int i = smallestIndex; i < arr.length; i++){
            if(arr[i]< arr[smallestIndex]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
