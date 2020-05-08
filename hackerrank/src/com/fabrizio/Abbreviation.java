package com.fabrizio;
//Complete the function  in the editor below. It must return either  or .
//
//        abbreviation has the following parameter(s):
//
//        a: the string to modify
//        b: the string to match
public class Abbreviation {
    public class Solution {
    }

    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {
// delete
// return yes if equal
// eliminate lowercase one by one
        for(int i = 0; i < a.length(); i++){
            for (int j =0; j < b.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    return "YES";
                }

            }
}
