package com.fabrizio;

public class UpperFirstLetter {
    public static void main(String[] args) {
        // uppercase only first letter of string
        String x = "uppercase all letters";
        char y[] = x.toCharArray();
        int size = y.length;

        y[0] = (char) (y[0] - 32); //set to uppercase - first overall character

        int i = 1;
        while (i != size) {
            if (y[i] == ' ')
            { // if statement to check if space white space
                y[i + 1] = (char) (y[i+1] - 32);
            }
            ++i;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
