package com.fabrizio;

public class StartHi {
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        if(str.substring(0, 2).equals("hi")) {
            return true;
        } else {
            return false;
        }

    }
}
