package com.fabrizio;

import java.util.Scanner;

// add two binary numbers
public class BinaryNumbers {
    public static void main(String[] args){
    //declare variables as long
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();
    }
}
