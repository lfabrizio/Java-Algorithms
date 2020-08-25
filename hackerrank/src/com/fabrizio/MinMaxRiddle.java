package com.fabrizio;

import java.util.ArrayList;
import java.util.List;

public class MinMaxRiddle {
    static void riddle(long[] arr) {
        // complete this function
        List<Long> result = new ArrayList<Long>(); //Creating arrayList
        Object[] array = result.toArray();
        int arrLength = arr.length;

        for (int idx = 0, idx2 = 1; idx < arrLength; idx++, idx2++) {
            System.out.println(Math.min(arr[idx], arr[idx2]));
        }
    }
}