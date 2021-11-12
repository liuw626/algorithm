package com.godric.v21_11.algo;

import com.godric.v21_11.utils.ArrayUtil;

public class C02_BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i=0; i<arr.length-1; i++) {
            // most execute n-1 times, final put smallest num to arr[i]
            for (int j=arr.length-1; j>i; j--) {
                if (arr[j] < arr[j-1]) {
                    // bubble to front
                    ArrayUtil.swap(arr, j, j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int maxSize = 5000;
        int maxValue = 10000;
        int testTimes = 50000;

        while (testTimes-- > 0) {
            int[] arr = ArrayUtil.generateRandomArr(maxSize, maxValue);
            int[] arr1 = ArrayUtil.copyArr(arr);
            int[] arr2 = ArrayUtil.copyArr(arr);

            bubbleSort(arr1);
            ArrayUtil.comparator(arr2);

            if (!ArrayUtil.isEquals(arr1, arr2)) {
                System.out.println("You have wrong in selection sort, arr :");
                ArrayUtil.printArr(arr);
                System.out.println("bubble sort result:");
                ArrayUtil.printArr(arr1);
                System.out.println("system sort result:");
                ArrayUtil.printArr(arr2);
                return;
            }
            if (testTimes % 100 == 0) {
                System.out.println("wait please, lost time is " + testTimes);
            }
        }

        System.out.println("nice！");
    }

}
