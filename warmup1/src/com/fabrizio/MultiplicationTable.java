package com.fabrizio;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("number: ");
    int number = input.nextInt();

    for(int i = 0; i < 10;i++){
        System.out.println(number + "X" + (i+1) + "=" + (number * (i+1)));
    }
}}
