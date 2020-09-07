package com.fabrizio;

import java.util.Arrays;

public class Anagram {
    // what is an anagram?
    public static void main(String[] args){
        String x = "silent";
        String y = "listen";
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a, b);

        if(result == true)
        {
            System.out.println("this is an anagram");

        }
        else
        {
            System.out.println("not an anagram");
        }

    }
}
