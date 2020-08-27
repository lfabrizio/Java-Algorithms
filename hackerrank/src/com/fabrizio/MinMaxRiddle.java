package com.fabrizio;

import java.util.ArrayList;
import java.util.List;

public class MinMaxRiddle {
    static void riddle(long[] arr) {
        // complete this function
        List<Long> result = new ArrayList<Long>(); //Creating arrayList
        Object[] array = result.toArray(); // to array
        int arrLength = arr.length; //get array length
        // loop through to find max and min
        // loop
        for (int idx = 0, idx2 = 1; idx < arrLength; idx++, idx2++) {
            System.out.println(Math.min(arr[idx], arr[idx2]));
        System.out.println("print here: ")
        }
    }
}
//
//    static long[] riddle(long[] arr) {
//        // complete this function
//        List<Object[]> arrayList = new ArrayList<Object[]>();
//        List<Long> longList = new ArrayList<Long>();
//        long[] newArr = {1};
//        int windowCounter = 1;
//        for (int k = 0; k < windowCounter; k++) {
//            for (int i = 0; i < arr.length; i++) {
//                if (i + windowCounter > arr.length) {
//                    break;
//                }
//                for (int j = i; j < windowCounter + i; j++) {
//                    // System.out.println("Arr item: " + arr[j] + " J:" + j);
//                    longList.add(arr[j]);
//                }
//                arrayList.add(longList.toArray());
//                longList = new ArrayList<Long>();
//            }
//            if (windowCounter > arr.length) {
//                break;
//            } else {
//                windowCounter++;
//            }
//        }
//        for (Object[] longIntArray : arrayList) {
//            for (Object longInt : longIntArray) {
//                System.out.println(longInt);
//            }
//            System.out.println("New Array");
//        }
//        return newArr;
//    }