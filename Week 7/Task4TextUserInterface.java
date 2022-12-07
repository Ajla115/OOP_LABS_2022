package com.Week7;

import java.util.Scanner;

public class Task4TextUserInterface {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}

