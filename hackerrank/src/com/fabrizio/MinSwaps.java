package com.fabrizio;

public class MinSwaps {
    static int minimumSwaps(int[] arr) {
        int i = 0, j = 0,
                len = arr.length,
                swapCount = 0;
        while (i < len) {
            j = arr[i] - 1;
            if (i != j)
                swapCount += swap(i, j, arr);
            else
                i++;
        }
        return swapCount;
    }
    static int swap(int a, int b, int[] arr) {
        System.out.println("swap (" + a + "," + b + ")");
        int item = arr[a];
        arr[a] = arr[b];
        arr[b] = item;
        return 1;
    }
}
