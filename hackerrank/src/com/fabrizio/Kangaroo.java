package com.fabrizio;

public class Kangaroo {
    // try to find a place where kangaroo 1 and 2 meet

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1 > v2){

            int remainder = (x1 - x2) % (v2 - v1);

            if (remainder == 0) {
                return "YES";
            }
        }
        return "NO";
    }

}
