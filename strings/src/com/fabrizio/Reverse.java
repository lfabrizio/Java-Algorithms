package com.fabrizio;

public class Reverse {
    public static void main(String[] args){
        String x = "Louis";  //string
        char y[] = x.toCharArray(); //string to array
        int size = y.length; //get length
        char a[] = new char[size]; //new array

        int i = 0; // declare integer variable

        while(i != size) // while loop to run as long as size isnt equal
        {
            a[size-1-i] = y[i]; // reverse in new array
            ++i;
        }
        System.out.println(a);
        System.out.println(y);
    }
}
