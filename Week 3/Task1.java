package com.Week3;
/*Create the method average, which calculates the average of the numbers it gets as parameters.
Inside the method you should use the method sum as a helper!  Place the method in the following program body:*/
public class Task1 {
    public static void main(String[] args) {
        double answer = average(4,3,6,1);
        System.out.println("Average: " + answer);
    }
    public static double average(int number1, int number2, int number3, int number4){
        int sum = number1+number2+number3+number4;
        return(sum / (double) 4); //or 4f or 4.0
        //ne zaboraviti uraditi typecasting
        //ne pretpostaviti da ce automatski uraditi typecasting
    }
}
