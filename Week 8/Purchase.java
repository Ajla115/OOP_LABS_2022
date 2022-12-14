package com.Week8;
/*Create the class Purchase with the following functionality:
a constructor public Purchase(String product, int amount, int unitPrice), which creates a purchase corresponding
to the parameter product. The product unit amount of purchase is clarified by the parameter amount,
and the third parameter is the unit price
public int price(), which returns the purchase price. This is obtained by raising the unit amount by the unit price
public void increaseAmount() increases by one the purchase unit amount
public String toString() returns the purchase in a string form like the following
we update the Purchase object corresponding to the existing product by calling its method increaseAmount()*/

public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String p, int a, int uP){
        this.product = p;
        this.amount = a;
        this.unitPrice = uP;
    }

    public int price(){
        return this.amount * this.unitPrice;
    }

    public void increaseAmount(){
        this.amount++;
    }

    public String toString(){
        return this.product + ": " + this.amount;
    }

}

