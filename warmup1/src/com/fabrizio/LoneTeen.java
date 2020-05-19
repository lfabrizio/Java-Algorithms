package com.fabrizio;

public class LoneTeen {
    // boolean variables
    // return booleans
    public boolean loneTeen(int a, int b) {
        boolean teenA = (a >= 13 && a <= 19);
        boolean teenB = (b >= 13 && b <= 19);

        return (teenA && !teenB) || (!teenA && teenB);
    }

}
