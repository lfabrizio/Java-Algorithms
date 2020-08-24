package com.fabrizio;

import java.util.Scanner;
// take in to integer input numbers then multiply sum of two
public class Multiply {
    public static void main(String[] args){
        // take input from console, system.in passed as a parameter
        // make a new object of the scanner class
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();
// parsed into an integer use nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}
