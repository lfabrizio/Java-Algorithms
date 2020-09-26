package com.fabrizio.Yahtzee;

import java.util.ArrayList;
import java.util.List;


public class Hand {
    private List<Die> dice;
    private int diceSize;


    public Hand(int diceSize) {
        this.diceSize = diceSize;
    }

    public void rollAll() {
        for (int i = 0; i < 5; i++) {
            Die die = new Die();
            die.getValue();
            die.roll();
            dice.add(die);
        }
    }
}
