package com.Week8;
/*Create the class Storehouse with the following methods:
public void addProduct(String product, int price, int stock), adding to the storehouse a product whose price
and number of stocks are the parameter values
public int price(String product) returns the price of the parameter product; if the product is not available in the
storehouse, the method returns -99
Inside the storehouse, the prices (and soon also the stocks) of the products have to be stored into a
Map<String, Integer> variable! The type of the object so created can be HashMap, but you should use the interface
 Map for the variable type. Store product stocks in a similar Map<String, Integer> variable as the one you used for
 their prices. Fill the Storehouse with the following methods:
public int stock(String product) returns the stock of the parameter product.
public boolean take(String product) decreases the stock of the parameter product by one, and it returns true if
 the object was available in the storehouse. If the product was not in the storehouse, the method returns false,
 the product stock cannot go below zero. public Set<String> products() returns a name set of the products contained in
 the storehouse. The method can be implemented easily. Using the Map's method keySet, you can get the storehouse products by asking for
their prices or stocks.


 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class Storehouse {
        Map<String, Integer> prices;
        Map<String, Integer> stocks;

        public Storehouse(){
            this.prices = new HashMap<String, Integer>();
            this.stocks = new HashMap<String, Integer>();
        }

        public void addProduct(String product, int price, int stock){
            prices.put(product, price);
            stocks.put(product, stock);
        }

        public int price(String product){
            if(prices.containsKey(product)){
                return prices.get(product);
            }else{
                return -99;
            }
        }

        public int stock(String product){
            if(stocks.containsKey(product)){
                return stocks.get(product);
            }else{
                return 0;
            }
        }

        public boolean take(String product){
            if(stocks.containsKey(product)){
                if(stocks.get(product) > 0){
                    stocks.put(product, stocks.get(product)-1);
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

        public Set<String> products(){
            return prices.keySet();
        }


    }

