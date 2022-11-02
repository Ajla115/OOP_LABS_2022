package com.Week3;
/*Create the method lengths that gets a list of String variables as a parameter
and returns an ArrayList that contains the lengths of the Strings in the same order as the original list.*/

import java.util.ArrayList;

public class Task7 {
    public static ArrayList<Integer> lengths (ArrayList<String> list) {
            ArrayList<Integer> lengths = new ArrayList<Integer>();
            for (String i : list) {
                lengths.add(i.length());
            }
            return lengths;
        }

    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of the strings: " + lengths);
    }

    }

//array list can also run with primitive values, mada ne znamo je li sa njima onda moze .add, .delete*/