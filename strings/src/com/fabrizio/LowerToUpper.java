package com.fabrizio;

public class LowerToUpper {
    public static void main(String[] args) {
        String x = "louis";
        char y[] = x.toCharArray();
        int size = y.length;

        int i = 0;
        while (i != size) {
            y[i] = (char) (y[i] - 32);
            ++i;
        }
        System.out.println(y);
    }
}