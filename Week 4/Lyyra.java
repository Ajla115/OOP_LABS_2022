package com.Week4;
/*The University of Helsinki students use so-called Lyyra cards to pay for their meals in student cafeterias. In this assignment, we
 implement the class LyyraCard that simulates the Lyyra card.
 */
public class Lyyra {
    private double balance;
    private String name;

    public Lyyra(double balanceAtStart) {
        this.balance = balanceAtStart;

    }

    public Lyyra(double balanceAtStart, String name){
        this.balance = balanceAtStart;
        this.name = name;
    }

    public String toString() {
        return "The card has " + this.balance + " euros.";
    }
    //official method to represent an object in textual form

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }

    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if ((this.balance + amount) > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }
}

