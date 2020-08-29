package com.fabrizio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write to compare two numbers
        // create scanner
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Input first Number: ");
        number1 = input.nextInt(); //read number from user and input in variable number1

        System.out.print("Input Second number: ");
        number2 = input.nextInt(); //same but for variable number2


        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );
    }
}
