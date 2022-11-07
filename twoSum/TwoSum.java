package com.leetcode.twoSum;

import java.util.Arrays;

public class TwoSum {

    static int[] nums = {3, 5, 7};

    public static int[] twoSum(int[] nums, int target) {

        int[] array = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    if (nums[i] >= nums[j]) {
                        array[0] = j;
                        array[1] = i;
                    } else {
                        array[1] = j;
                        array[0] = i;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }


    public static void main(String[] args) {
        TwoSum.twoSum(nums, 10);
    }

}

