package com.AdditionalTasksWeek7;

import java.util.HashMap;

/*Define a class called  Month  that is an abstract data type for a month. Your class will have one member variable
of type int  to represent a month (1 for January, 2 for February, and so forth). Include all the following member
functions: a constructor to set the month using the first three letters in the name of the month as three arguments,
a constructor to set the month using an integer as an argument (1 for January, 2 for February, and so forth), a
default constructor, an input function that reads the month as an integer, an input function that reads the month
as the first three letters in the name of the month, an output function that outputs the month as an integer,
an output function that outputs the month as the first three letters in the name of the month,
 and a member function that returns the next month as a value of type Month .
 */
public class Month {
    private String monthString;
    private HashMap<Integer, String> months = MapOfMonths.months();
    private int monthNumber;
    public Month(int monthNumber){
        this.monthNumber = monthNumber;
        this.monthString = this.mapToMonth(monthNumber);
    }

    public Month(String monthForShort){
        this.monthNumber = (int) this.mapToMonth(monthForShort).keySet().toArray()[0];
        this.monthString = (String) this.mapToMonth(monthForShort).values().toArray()[0];
    }
    private String mapToMonth(int monthNumber){
        return this.months.get(monthNumber);
    }
    private HashMap<Integer, String> mapToMonth(String monthForShort){
        HashMap<Integer, String> result = new HashMap<>();
        for(int i : this.months.keySet()){
            if(this.months.get(i).toLowerCase().contains(monthForShort.toLowerCase())){
                result.put(i, this.months.get(i));
                return result;
            }
        }
        return null;
    }

    public String getMonthForShort(){
        return this.monthString.substring(0, 3);
    }

    public int getMonthNumber(){
        return this.monthNumber;
    }

    public Month getNextMonth(){
        if(this.monthNumber+1 <= 12) return new Month(this.monthNumber + 1);
        return new Month(1);
    }
}

