package com.fabrizio;

import java.security.SecureRandom;
import java.util.Random;
//v1.0 I have a die
// v1.1 that die can be rolled to have a random value
public class Die {
    // get the die
    //also store number of sides of the die
    private int diceSides = 6; // dice sides
    private int value = 0; //to store value of dice rolled
    private int timesRolled = 0; // keep track of how many times rolled

    public int roll() {
        Random random = new Random(); //random

       value =  random.nextInt((diceSides + 1)); // will give random number from zero to dicesides, so must add 1
        return value;
    }
}

