package com.fabrizio;

import java.util.Scanner;

public class CompareTwo {
    //compare two
    public static void main(String[] args){
        // create scanner
        Scanner input = new Scanner(System.in);
        int numberOne;
        int numberTwo;

        System.out.print( "Input first integer: " ); // prompt
        numberOne = input.nextInt(); // read first number from user

        System.out.print( "Input second integer: " ); // prompt
        numberTwo = input.nextInt(); // read second number from user

        if(numberOne == numberOne){
            System.out.println("equal numbers");
        } else {
        System.out.println("not equal");
        }
    }
}
