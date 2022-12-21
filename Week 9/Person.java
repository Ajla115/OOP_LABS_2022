package com.Week9.mooc;

public class Person {
    public Person(String name, int age){
        if(name == null || name.equals("") || name.length() > 40 || age < 0 || age > 120){
            throw new IllegalArgumentException("Illgeal parameter value. Please provide valid parameters");
        } else{
            System.out.println("OK");
        }
    }
}

