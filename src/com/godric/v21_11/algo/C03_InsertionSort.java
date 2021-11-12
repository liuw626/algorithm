package com.godric.v21_11.algo;

import com.godric.v21_11.utils.ArrayUtil;

public class C03_InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i=1; i<arr.length; i++) {
            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {
                ArrayUtil.swap(arr, index, index - 1);
                index--;
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

            insertionSort(arr1);
            ArrayUtil.comparator(arr2);

            if (!ArrayUtil.isEquals(arr1, arr2)) {
                System.out.println("You have wrong in selection sort, arr :");
                ArrayUtil.printArr(arr);
                System.out.println("insertion sort result:");
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
