package com.fabrizio.Yahtzee;

import java.util.ArrayList;


public class Hand {
    private ArrayList<Die> dice = new ArrayList<>();
    private int diceSize;


    public Hand(int diceSize) {
        this.diceSize = diceSize;
    }

    public void rollAll() {
        for (int i = 0; i < 5; i++) {
            Die die = new Die();
            die.roll(); //error
            dice.add(die);
        }
    }
}
