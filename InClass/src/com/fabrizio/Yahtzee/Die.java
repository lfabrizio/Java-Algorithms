package com.fabrizio.Yahtzee;


import java.util.Random;

public class Die {
    private int value;
    private int sides = 6;
    private Random rand = new Random();

    public Die(){
        value = 1;
    }
//overloading
    public Die(int sides){
        value = 1;
        this.sides = sides;
    }

    public void roll(Random rand){
    value = rand.nextInt(sides)+1;
    }

    public int getValue() {// get value
        return value;
    }
}
