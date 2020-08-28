package com.fabrizio;
// swap variables
//define swap(a, b)
//        temp := a
//        a := b
//        b := temp
public class SwapVariables {
    public static void main(String[] args){
    // declare variables
    int temp, a, b;
    a = 15;
    b = 27;
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
    temp = a;
    a = b;
    b = temp;
  System.out.println("After swapping : a, b = "+a+", "+ + b);
}
}
