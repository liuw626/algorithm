package com.godric.v21_11.algo;

import java.util.ArrayList;
import java.util.List;

public class C08_EvenTimesOddTimes {

    /**
     * arr中, 只有一种数出现过奇数次, 其他数都出现过偶数次, 找到他
     */
    public static int getOddTimeNum1(int[] arr) {
        int eor = 0;
        for (int num : arr) {
            eor ^= num;
        }
        return eor;
    }

    /**
     * arr中, 有两种数出现过奇数次, 其他数出现过偶数次, 找到这两个数
     */
    public static int[] getOddTimeNum2(int[] arr) {
        int eor = 0;
        for (int num : arr) {
            eor ^= num;
        }
        // now eor = a ^ b;
        int rightOne = eor & (~eor + 1);

        int a = 0;
        for (int num : arr) {
            if ((num & rightOne) != 0) {
                a ^= num;
            }
        }

        int b = eor ^ a;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        System.out.println(getOddTimeNum1(new int[]{1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5}));
        int[] oddTimeNum2 = getOddTimeNum2(new int[]{1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6});
        System.out.println(oddTimeNum2[0] + ", " + oddTimeNum2[1]);
    }

}
