package com.Week8;

import java.util.Scanner;
/*Now, all the parts of our online shop are ready. Our online shop has a storage house, which contains all products.
We have got a shopping basket to manage all our customers. Whenever a customer chooses a purchase,
we add it to the shopping basket if the product is available in our storage house. Meanwhile,
the storage stocks are reduced by one. There are comments in the method public void manage(String customer),
showing the part that you should implement
 */

    public class Shop {
        private Storehouse store;
        private Scanner reader;

        public Shop(Storehouse store, Scanner reader) {
            this.store = store;
            this.reader = reader;
        }

        // the method to deal with a customer in the shop
        public void manage(String customer) {
            ShoppingBasket basket = new ShoppingBasket();
            System.out.println("Welcome to our shop " + customer);
            System.out.println("below is our sale offer:");

            for (String product : store.products()) {
                System.out.println( product );
            }

            while (true) {
                System.out.print("what do you want to buy (press enter to pay):");
                String product = reader.nextLine();
                if (product.isEmpty()) {
                    break;
                }

                if(store.stock(product) > 0){
                    store.take(product);
                    basket.add(product, store.price(product));
                }

                // here, you write the code to add a product to the shopping basket, if the storehouse is not empty
                // and decreases the storehouse stocks
                // do not touch the rest of the code!

            }

            System.out.println("your purchases are:");
            basket.print();
            System.out.println("basket price: " + basket.price());
        }
    }
