package com.fabrizio.Yahtzee;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Die> dice;

    public Hand(){
        dice = new ArrayList<Die>();
        for(int count = 0; count < 5;count++){
        var die = new Die();
        dice.add(die);
        }

        public void rollAll(){
            for(die : dice)
            {
                
            }
        }

    }
}
