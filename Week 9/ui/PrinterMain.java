package com.Week9.mooc.ui;

import com.Week9.mooc.Printer;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer("C:\\Users\\User\\IdeaProjects\\LABS\\src\\com\\Week9\\mooc\\textfile\\txt");
        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
