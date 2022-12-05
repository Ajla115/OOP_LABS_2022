package com.Week6;

public class StringUtils {


    public static boolean included(String word, String searched){
        word = word.trim();
        searched = searched.trim();

        word = word.toUpperCase();
        searched = searched.toUpperCase();

        if(word.contains((searched))){
            return true;
        }
        return false;
    }

    //when the method is static, the object does not have to be born, we can immediately call the method
    //no need to instantiate an object





}
