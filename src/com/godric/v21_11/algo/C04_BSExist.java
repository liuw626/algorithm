package com.godric.v21_11.algo;

import com.godric.v21_11.utils.ArrayUtil;

import java.util.Arrays;

/**
 * 二分查找元素是否存在
 */
public class C04_BSExist {

    /**
     * 在一个有序不重复的数组arr中, 查找是否存在target的存在
     */
    public static boolean bsExist(int[] arr, int target) {
        if (arr == null || arr.length < 1) {
            return false;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static boolean test(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
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
            if (test(arr, value) != bsExist(arr, value)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

}
