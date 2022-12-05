package com.Week6;
/*Implement a method smallest,
 which returns the smallest value in the array. The frame of the method is as follows:
 */
public class Task1 {
    public static void main(String[] args) {
        int[] niz = {1,2,3,4,5,6,7};
        System.out.println(smallest(niz));
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
}
