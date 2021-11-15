package com.godric.v21_11.algo;

import com.godric.v21_11.utils.ArrayUtil;

import java.util.Arrays;

public class C06_BSNearRight {

    // 在已排序的数组arr上，找满足<=target的最右位置
    public static int nearestRightIndex(int[] arr, int target) {
        if (arr == null || arr.length < 1 || arr[0] > target) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int test(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] <= target) {
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
            if (test(arr, value) != nearestRightIndex(arr, value)) {
                ArrayUtil.printArr(arr);
                System.out.println(value);
                System.out.println(test(arr, value));
                System.out.println(nearestRightIndex(arr, value));
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

}
