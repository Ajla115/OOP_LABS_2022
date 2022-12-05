package com.Week6;

import java.util.Arrays;

/*Create a method swap, to which will be passed an array and two of its indexes.
The method swaps the values in the indexes around. The frame of the method looks like this:
 */
public class Task4 {
    public static void main(String[] args) {
        int[] niz = {1,2,3};
        swap(niz,1,2);
        System.out.println(Arrays.toString(niz));
    }
    public static void swap(int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] =  arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
