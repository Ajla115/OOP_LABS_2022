package com.Week2;

import java.util.Scanner;

//Create a program that asks the user for a password.
// If the password is right, a secret message is shown to the user.
public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        //definisali smo ga jednom izvana jer on otvora mjesto u memoriji, a ovako ga nismo zatvorili
        //da je bio u while loop svaki put bi zauzimao novu memoriju
        while(true){
            System.out.print("Type the passowrd: ");
            String password = reader.nextLine();
            if (password.equals("yellow ball")){
                System.out.println("Right!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: jryy qbar!");
        //reader.close(); - ovo sad nije toliko bitno ali se koristi da ubrza memoriju i
    }
}
