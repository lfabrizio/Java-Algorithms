package com.fabrizio;

public class Palindrome {
    // Palindrome - sequence that reads the same whether forward or backwards
    public static void main(String[] args){
        String x = "refer";
        char y[] = x.toCharArray();
        int size = y.length;
        char a[] = new char[size];

        int i = 0;
        while(i != size)
        {
            if(a[i] != y[i])
            {
                System.out.println("Not a Palindrome");
            } else {
                ++i;
                continue;
            }
        }
        System.out.print("Palindrome");
    }
}
