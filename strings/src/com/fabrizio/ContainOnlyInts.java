package com.fabrizio;

public class ContainOnlyInts {
    public static void main(String[] args){
        String x = "97862";
        char y[] = x.toCharArray();
        int size = y.length;

        int i = 0;
        while(i != size)
        {
            if(y[i] >= 0 && y[i] <= 9)
            {
                ++i;
            }
            else {
                System.out.println("not an integer string");
            }
        }
        System.out.println("Integer string");
    }
}
