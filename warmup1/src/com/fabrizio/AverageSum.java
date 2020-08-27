package com.fabrizio;

import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter Third number: ");
        int num3 = in.nextInt();

        System.out.print("Enter Fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Enter Fifth number: ");
        int num5 = in.nextInt();

        System.out.println("average of numbers is " + (num1 + num2 + num3 + num4 + num5)/5);
    }
}
