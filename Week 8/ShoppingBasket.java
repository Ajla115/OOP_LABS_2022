package com.Week8;
/*Let's create a constructor without parameter for our shopping basket, as well as the following methods:
public void add(String product, int price) adds a purchase to the shopping basket; the purchase is defined by the
parameter product, and its price is the second parameter.
public int price() returns the shopping basket total price
Let's create the method public void print() for our shopping basket.
This prints out the Purchase objects which are contained by the basket. */

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
        Map<String, Purchase> basket;

        public ShoppingBasket(){
            basket = new HashMap<String, Purchase>();
        }

        public void add(String product, int price){
            if(basket.containsKey(product)){
                basket.get(product).increaseAmount();
            } else {
                Purchase purchase = new Purchase(product, 1, price);
                basket.put(product, purchase);
            }
        }

        public int price(){
            int total_price = 0;

            for(Purchase p : basket.values()){
                total_price = total_price + p.price();
            }

            return total_price;
        }

        public void print(){
            for(Purchase p : basket.values()){
                System.out.println(p);
            }
        }
}
