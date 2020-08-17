package com.fabrizio;

import java.util.Arrays;

public class Hash {

    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    public static void main(String[] args) {

    }

    public void hashFunction(String[] stringsForArray, String[] theArray){
        for(int n = 0; n < stringsForArray.length; n++)

            String newElementVal = stringsForArray[n];

        theArray[Integer.parseInt(newElementVal)] = newElementVal;
    }
}

    HashFunction(int size) {
s
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }


