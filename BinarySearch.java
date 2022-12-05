package com.Week6;

public class BinarySearch {
    public static boolean search(int[] arr, int value){
        int first = 0, last = arr.length - 1;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < value ){
                first = mid + 1;
            }else if ( arr[mid] == value ){
                return true;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return false;
    }
}

