package com.godric.v21_11.utils;

import java.util.Arrays;

public class ArrayUtil {

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] copyArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        return copyArr;
    }

    /**
     * Math.random()  ->  [0, 1)
     * Math.random() * maxSize	->	[0, maxSize)
     * Math.random() * (maxSize + 1)	->	[0, maxSize + 1)
     * (int)(Math.random() * (maxSize + 1))		->	[0, maxSize]
     */
    public static int[] generateRandomArr(int maxSize, int maxValue) {
        int[] arr = new int[(int)(Math.random() * (maxSize + 1))];
        for (int i=0; i<arr.length; i++) {
            // [0, maxValue] - [0, maxValue]	-maxValue ~ maxValue
            arr[i] = (int)(Math.random() * (maxValue + 1)) - (int)(Math.random() * (maxValue + 1));
        }

        return arr;
    }

    public static boolean isEquals(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return false;
        }
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

}
