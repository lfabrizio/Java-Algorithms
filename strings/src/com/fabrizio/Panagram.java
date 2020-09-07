package com.fabrizio;

public class Panagram {

    // start panagram algo
    //loop over array to maek sure every alphabet
    public static void main(String[] args){
        String x = "the quick brown fox jumps over lazy dog";
        x = x.replace(" ", "");
        char y[] = x.toCharArray();
        int size = y.length;
        int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int i = 0;
        while(i != size){
            int index = y[i]-65;
            a[index] = 1;
            ++i;
        }
        i = 0;
        while(i != 26){
            if(a[i] == 1){
                ++i;
            }
            else{
                System.out.println("non-pangram");
            }
        }
        System.out.println("pangram");
    }

}
