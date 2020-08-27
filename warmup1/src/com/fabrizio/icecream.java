//package com.fabrizio;
//
//public class icecream {
//
//    // Complete the whatFlavors function below.
//    static void whatFlavors(int[] cost, int money) {
//        // array we will return
//        int[] tempArray = new int[2];
//
//        // nested loop
//        for (int i = 0; i < cost.length; i++) {
//            //inner loop
//            for (int j = i + 1; j < cost.length; j++) {
//                //if statement to determine if combo equals the $
//                if (cost[i] + cost[j] == money) {
//                    // place indexes in temp array
//                    tempArray[0] = i+1;
//                     tempArray[1] = j+1;
//                    return tempArray;
//                }
//            }
//
//        }
//    }}
