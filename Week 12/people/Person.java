package com.week12.people;
/*a) Create the package people and the class Person in it; Person works in relation to the following main program*/
public class Person {
    private String name;
    private String address;

    public Person(String newName, String newAddress){
        this.name = newName;
        this.address = newAddress;
    }

    public String toString(){
        return this.name + "\n" + this.address;
    }
}
