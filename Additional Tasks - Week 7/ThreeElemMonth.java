package com.AdditionalTasksWeek7;

import java.util.HashMap;

/*Implement the class  Month. The month is implemented as three member variables of type char
that store the first three letters in the name of the month. Embed your definition in a test program.
 */
public class ThreeElemMonth {
    private char firstLetter;
    private char secondLetter;
    private char thirdLetter;
    private HashMap<Integer, String> months = MapOfMonths.months();

    public ThreeElemMonth(String monthForShort) {
        this.firstLetter = monthForShort.charAt(0);
        this.secondLetter = monthForShort.charAt(1);
        this.thirdLetter = monthForShort.charAt(2);
    }

    public HashMap<Integer, String> mapToMonth(String monthForShort) {
        HashMap<Integer, String> result = new HashMap<>();
        for (int i : this.months.keySet()) {
            if (this.months.get(i).toLowerCase().contains(monthForShort.toLowerCase())) {
                result.put(i, this.months.get(i));
                return result;
            }
        }
        return null;
    }

    public String toString() {
        return "Month: " + this.firstLetter + this.secondLetter + this.thirdLetter +
                (this.mapToMonth("" + this.firstLetter + this.secondLetter + this.thirdLetter) != null ?
                        " exists and is short for " + this.mapToMonth(""+ this.firstLetter + this.secondLetter + this.thirdLetter).values().toArray()[0]
                        : " Does not exist");
    }
}

