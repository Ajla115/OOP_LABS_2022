package com.Week7;

import java.util.ArrayList;

public class Task3DictionaryClass {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        Dictionary dictionary1 = new Dictionary();
        dictionary1.add("apina", "monkey");
        dictionary1.add("banaani", "banana");
        System.out.println(dictionary1.amountOfWords());

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());

        Dictionary dictionary2 = new Dictionary();
        dictionary2.add("apina", "monkey");
        dictionary2.add("banaani", "banana");
        dictionary2.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary2.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }


    }
}
