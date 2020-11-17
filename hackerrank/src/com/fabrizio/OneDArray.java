package com.fabrizio;

public class OneDArray {
    public static boolean canWin(int leap, int[] game) {
        return canWin(0, leap, game);
    }
    static boolean canWin(int i, int leap, int[] game) {
        if (i < 0 || (i < game.length && game[i] != 0)) return false;
        if (i >= game.length - 1) return true;
        game[i] = 1;
        return canWin(i + leap, leap, game) ||
                canWin(i + 1, leap, game) ||
                canWin(i - 1, leap, game);
    }
}
