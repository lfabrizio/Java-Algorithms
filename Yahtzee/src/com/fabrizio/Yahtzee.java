package com.fabrizio;

import java.util.Random;
        import java.util.Scanner;

public class Yahtzee {

    // create scanner class --
    // look into randomizer
    int[] diceArray = new int[5]; // declaring an array for 5 die
    int numSides;
    // create instance of Random class
    Random rand = new Random();

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Roll Dice");
        String userName = input.nextLine();  // Read user input


    }
    //    public int roll() {
//        int roll = (int)(Math.random() * 6) + 1;
//        return roll;
//    }
// or put this in a while loop
    int a =  (int) (Math.random()*5 + 1);  // is this  math correct?
    int b =  (int) (Math.random()*5 + 1);
    int c =  (int) (Math.random()*5 + 1);
    int d =  (int) (Math.random()*5 + 1);
    int e =  (int) (Math.random()*5 + 1);
    int f =  (int) (Math.random()*5 + 1);
}