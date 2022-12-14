package com.Week8;

import java.util.Scanner;

public class StorehouseMain {
    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk:  " + store.price("milk"));
        System.out.println("coffee:  " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));

        Storehouse store1 = new Storehouse();
        store1.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        Storehouse store2 = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store2.products()) {
            System.out.println(product);
        }

        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );

        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());

        basket.print();

        ShoppingBasket basket2 = new ShoppingBasket();
        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("buttermilk", 2);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        Storehouse store3 = new Storehouse();
        store3.addProduct("coffee", 5, 10);
        store3.addProduct("milk", 3, 20);
        store3.addProduct("milkbutter", 2, 55);
        store3.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
}
