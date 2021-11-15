package com.godric.v21_11.algo;

import com.godric.v21_11.utils.ArrayUtil;

import java.util.Arrays;

public class C05_BSNearLeft {
    // 在已排序的数组arr上，找满足>=target的最左位置
    public static int nearestLeftIndex(int[] arr, int target) {
        if (arr == null || arr.length < 1 || arr[arr.length - 1] < target) {
            return -1;
        }
        int left = 0;
        int right = arr.length;
        int ans = -1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }

    // for test
    public static int test(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = ArrayUtil.generateRandomArr(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            if (test(arr, value) != nearestLeftIndex(arr, value)) {
                ArrayUtil.printArr(arr);
                System.out.println(value);
                System.out.println(test(arr, value));
                System.out.println(nearestLeftIndex(arr, value));
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }


}
