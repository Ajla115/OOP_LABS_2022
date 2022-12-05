package com.Week6;

public class Task8 {
    public static void main(String[] args) {
        NightSky sky = new NightSky(0.1, 40, 10);
        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());
    }}
