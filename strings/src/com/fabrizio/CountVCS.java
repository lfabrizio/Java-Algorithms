package com.fabrizio;
// see if constants, vowels or special chr
public class CountVCS {
    public static void main(String[] args){
        String x = "Count the variables and char";
        char y[] = x.toCharArray();
        int size = y.length;
        int vowels = 0;
        int consts = 0;
        int special = 0;

        int i = 0;
        while(i != size)
        {
            if(y[i] >= 'A' && y[i] <= 'Z')
            {
                if(y[i]== 'A' || y[i]== 'E' || y[i]== 'I' || y[i] == 'O' || y[i] == 'U')
                {
                ++vowels;
                }
                else{
                    ++consts;
                }
            }
            else{
                ++special;
            }
                ++i;
        }
        System.out.println(y);
        System.out.print("vowle count" + vowels);
        System.out.println("constants count" +consts);
        System.out.println("Specials"+special);
    }
}
