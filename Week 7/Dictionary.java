package com.Week7;
/*In this exercise, we implement a dictionary which can be used to retrieve the English translation of Finnish words.
We implement our dictionary using the HashMap data structure.
Create a class called Dictionary. The class has the following methods:
a) public String translate(String word), returning the translation of its parameter. If the word is unknown, it returns null.
b) public void add(String word, String translation), adding a new translation to the dictionary
Implement the class Dictionary so that it contains only one object variable, a HashMap data structure
Add the method public int amountOfWords(), which returns the amount of words in the dictionary.
Add the method public ArrayList<String> translationList() to your dictionary, returning strings which stand for a content list
of your dictionary in the form key = value.*/

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
        private HashMap<String, String> dictionary;

        public Dictionary(){
            dictionary = new HashMap<String, String>();
        }

        public String translate(String word){
            if(dictionary.containsKey(word)){
                return dictionary.get(word);
            } else {
                //return "Word " + word + " is not in dictionary";
                return null;
            }
        }

        public void add(String word, String translation){
            dictionary.put(word, translation);
        }

        public int amountOfWords(){
            return dictionary.size();
        }

        public ArrayList<String> translationList(){
            ArrayList<String> translateList = new ArrayList<String>();

            for(String k : dictionary.keySet()){
                translateList.add(k + " = " + dictionary.get(k));
            }

            return translateList;
        }
}
