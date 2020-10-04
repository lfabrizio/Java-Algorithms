package com.fabrizio;

import java.util.HashMap;

public class TwoStrings {
    // Complete the twoStrings function below.
    //solved using hashmap
    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for(char letter: s1.toCharArray()){
            if(hash.containsKey(letter)){
                // put, get , +1
                hash.put(letter, hash.get(letter)+1);
            }
            hash.put(letter, 1);
        }

        for(char letter: s2.toCharArray()){
            if(hash.containsKey(letter)){
                return "YES";
            }
        }
        return "NO";
    }
}
