package com.Week8;

public class GenericClassMain {
    public static void main(String[] args) {
        GenericClass<Integer> g1 = new GenericClass(10);
        System.out.println("Integer: " + g1.getValue());
        GenericClass<String> g2 = new GenericClass("Hello");
        System.out.println("String: " + g2.getValue());
    }

}
