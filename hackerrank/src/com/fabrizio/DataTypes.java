package com.fabrizio;

import java.util.Scanner;

public class DataTypes {
    
        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);


            /* Declare second integer, double, and String variables. */
            int i2 = Integer.parseInt(scan.next());
            double d2 = Double.parseDouble(scan.next());
            scan.nextLine();
            String s2 = scan.nextLine();

            /* Read and save an integer, double, and String to your variables.*/
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

            /* Print the sum of both integer variables on a new line. */
            int integerSum = i + i2;
            System.out.println(integerSum);

            /* Print the sum of the double variables on a new line. */
            double doubleSum = d + d2;
            System.out.println(doubleSum);

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
            String stringSum = s + s2;
            System.out.println(stringSum);
            scan.close();
        }
}
