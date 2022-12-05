package com.Week6;

public class Book {
    private String title;
    private String publisher;
    private int publishingYear;

    public Book(String title, String publisher, int publishingYear ){
        this.title = title;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }

    public String title(){ //ovo je getter ali smo pisali ovako jer je ovako receno u zadatku
        return this.title;
    }

    public String publisher(){
        return this.publisher;
    }

    public int year(){
        return this.publishingYear;
    }

    public String toString(){
        return this.title + " from publisher " + this.publisher + " in year " + this.publishingYear;

    }


}
