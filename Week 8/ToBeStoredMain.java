package com.Week8;

public class ToBeStoredMain {
    public static void main(String[] args) {
        Book book1 = new Book("Writer 1", "Name 1", 1);
        Book book2 = new Book("Writer 2", "Name 2", 2);
        Book book3 = new Book("Writer 3", "Name 3", 3);

        CD cd1 = new CD("Artist 1", "Title 1", 2000);
        CD cd2 = new CD("Artist 2", "Title 2", 2000);
        CD cd3 = new CD("Artist 3", "Title 3", 2000);

        System.out.println(book1);

        Box box = new Box(6);
        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println(box);


        //printa         System.out.println(book1); //printa com.Week8.Book@568db2f2 bez toStringa jer je ovo kao memory reference

    }
}
