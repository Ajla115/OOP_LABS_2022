package com.Week6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();

    }

    public void addBook(Book newBook) {
        this.books.add(newBook); //da nismo u constructor stavili ovo this.books = new ArrayList<Book>(); ovdje bismo imali null pointer exception gresku
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.books) {
            if (book.title().contains(title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.books) {
            if (book.publisher().contains(publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.books) {
            if (year == book.year()) {
                found.add(book);
            }
        }
        return found;
    }
}


