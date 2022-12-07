package com.Week7;
/*Create the class PromissoryNote with the following functionality:
the constructor public PromissoryNote() creates a new promissory note
the method public void setLoan(String toWhom, double value) which stores the information about loans to specific people.
the method public double howMuchIsTheDebt(String whose) which returns the entity of the debt held by the parameter person
*/
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> notes;

    public PromissoryNote() {
        this.notes = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        notes.put(toWhom, value);

    }

    public double howMuchIsTheDebt(String whose) {
        if (notes.containsKey(whose)) {
            return notes.get(whose);
        }
        return 0;


    }
}



