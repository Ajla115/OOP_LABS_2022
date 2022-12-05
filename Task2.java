package com.Week6;
/*Implement a method indexOfTheSmallest,
which returns the index of the smallest value in the array (the position of the
value in the array, that is). The frame of the method looks like this:
 */
public class Task2 {
    public static void main(String[] args) {
        int[] niz = {4,5,6,7,3,4,0};
        System.out.println(indexOfTheSmallest(niz));
    }

    public static int indexOfTheSmallest(int[] arr){
        int smallestIndex = 0;
        for(int i = smallestIndex; i< arr.length; i++ ){
            if(arr[i]< arr[smallestIndex]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

}
