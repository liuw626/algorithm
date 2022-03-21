package com.godric.v21_11.algo;

/**
 * 局部最小值问题: 在一个先递减后递增的数组中找到极小值点
 */
public class C07_BSAwesome {

    public static int getLessIndex(int[] arr) {

        if (arr == null || arr.length < 1) {
            return -1;
        }

        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }

        int left = 1;
        int right = arr.length - 2;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 6, 7, 8, 9};
        System.out.println(arr[getLessIndex(arr)]);
    }

}
