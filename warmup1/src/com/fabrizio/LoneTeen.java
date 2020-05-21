package com.fabrizio;

public class LoneTeen {
    // boolean variables
    // return booleans
    public boolean loneTeen(int a, int b) {
        boolean teenOne = (a >= 13 && a <= 19);
        boolean teenTwo = (b >= 13 && b <= 19);

        return (teenOne && !teenTwo) || (!teenOne && teenTwo);
    }

}
