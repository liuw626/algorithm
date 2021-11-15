package com.godric.v21_11.algo;

public class C08_EvenTimesOddTimes {

    /**
     * arr中, 只有一种数出现过奇数次, 其他数都出现过偶数次, 找到他
     *
     * todo not finished
     */
    public static int getOddTimeNum(int[] arr) {
        int eor = 0;
        for (int num : arr) {
            eor ^= num;
        }
        return eor;
    }


    public static void main(String[] args) {
        System.out.println(getOddTimeNum(new int[]{1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5}));
    }

}
