package com.godric.v21_11.algo;

import com.godric.v21_11.utils.ArrayUtil;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 使用递归获取数组中的最大值
 */
public class C17_GetMaxByRecursive {

    public static int getMax(int[] arr) {
        if (arr == null || arr.length < 1) {
            return Integer.MIN_VALUE;
        }

        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = left + ((right - left) >> 1);
        return Math.max(process(arr, left, mid), process(arr, mid + 1, right));
    }

    public static int getMaxForTest(int[] arr) {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        int maxSize = 5000;
        int maxValue = 10000;
        int testTimes = 50000;

        while (testTimes-- > 0) {
            int[] arr = ArrayUtil.generateRandomArr(maxSize, maxValue);
            int[] arr1 = ArrayUtil.copyArr(arr);
            int[] arr2 = ArrayUtil.copyArr(arr);

            int ans1 = getMax(arr1);
            int ans2 = getMaxForTest(arr2);

            if (ans1 != ans2) {
                System.out.println("You have wrong in get max by recursive, arr :");
                ArrayUtil.printArr(arr);
                System.out.println("ans1: " + ans1 + ", ans2: " + ans2);
                return;
            }
        }

        System.out.println("nice！");
    }

}
