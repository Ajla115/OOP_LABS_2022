package com.Week2;
/*Create a program that calculates the sum of 20+21+22+...+2n,
where n is a number entered by the user. The notation 2i means raising the number 2 to the power of i,
for example 24 = 2*2*2*2 = 16. In Java we cannot write ab directly, but instead we can calculate the power
with the command Math.pow(number, power). Note that the command returns a number of double type
(i.e. floating point number). A double can be converted into the int type (i.e. whole number) as follows:
int result = (int)Math.pow(2, 3). This assigns the value of 23 to variable result.*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int read = reader.nextInt();
        int sum = 0;
        int x = 0;
        while(x <= read){
            sum += (int) Math.pow(2, x);
                    x++;
        }
        System.out.println("Sum is: " + sum);



    }
}
