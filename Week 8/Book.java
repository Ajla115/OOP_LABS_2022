package com.Week8;
/*Create two classes which implement the interface Book and CD. Book receives its writer (String),
 name (String), and weight (double), all as parameters.
 */
public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.writer + " " + this.name + " weight: " + this.weight;
    }
}
