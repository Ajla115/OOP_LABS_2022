package com.Week4;

public class Task3Vol6 {
    public static void main(String[] args) {
        Lyyra pekka = new Lyyra(20, "Pekka");
        Lyyra brian = new Lyyra(30, "Brian");

        pekka.payGourmet();
        brian.payEconomical();
        System.out.println(pekka);
        System.out.println(brian);

        pekka.loadMoney(20);
        brian.payGourmet();

        System.out.println(pekka);
        System.out.println(brian);

        pekka.payEconomical();
        pekka.payEconomical();

        brian.loadMoney(50);
        System.out.println(pekka);
        System.out.println(brian);


    }
}
