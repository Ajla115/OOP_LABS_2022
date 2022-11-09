package com.Week4;

public class Task3 {
    public static void main(String[] args) {
        Lyyra card = new Lyyra(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.loadMoney(34);
        System.out.println(card);

        card.loadMoney(-15);
        System.out.println(card);
    }
}
