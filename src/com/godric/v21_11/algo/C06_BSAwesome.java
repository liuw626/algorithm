package com.godric.v21_11.algo;

/**
 * 局部最小值问题: 在一个先递减后递增的数组中找到极小值点
 */
public class C06_BSAwesome {

    public static int getLessIndex(int[] arr) {
        int left = 1;
        int right = arr.length - 2;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (mid == 0 || arr[mid] < arr[mid - 1]) {
                left = mid + 1;
            } else if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return left;
    }

}
