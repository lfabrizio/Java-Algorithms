package com.fabrizio;

import java.security.SecureRandom;
import java.util.Random;

public class Die {
    private int diceSides = 6; // dice sides
    private int timesRolled = 0; // keep track of how many times rolled

    public void roll() {
        Random random = new Random();
        // +1  to stay away from zeros
        random.nextInt((diceSides));// this isnt right.. working on it
    }
    }
}
