package com.AdditionalTasksWeek7;

public class ClassForMonth {
    public static void main(String[] args) {
            Month m = new Month("nov");
            System.out.println(m.getMonthForShort());
            System.out.println(m.getMonthNumber());
            Month m1 =  m.getNextMonth();
            System.out.println(m1.getMonthForShort());
            System.out.println(m1.getMonthNumber());
        }
    }