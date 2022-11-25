package com.leetcode.easy.romanToInteger;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int romanToInt(String s) {

        if (s.length() < 1 || s.length() > 15) return -1;
        char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] tenth = {1, 5, 10, 50, 100, 500, 1000};
        int[] numbers = new int[s.length()];
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < roman.length; j++) {
                if (s.charAt(i) == roman[j]) {
                    numbers[i] = tenth[j];
                }
            }
        }

      //  System.out.println(Arrays.toString(numbers));    // check the array with converting numbers

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == 1 && numbers[i + 1] == 5) {
                numbers[i] = 4;
                numbers[i + 1] = 0;
            }
            if (numbers[i] == 1 && numbers[i + 1] == 10) {
                numbers[i] = 9;
                numbers[i + 1] = 0;
            }
            if (numbers[i] == 10 && numbers[i + 1] == 50) {
                numbers[i] = 40;
                numbers[i + 1] = 0;
            }
            if (numbers[i] == 10 && numbers[i + 1] == 100) {
                numbers[i] = 90;
                numbers[i + 1] = 0;
            }
            if (numbers[i] == 100 && numbers[i + 1] == 500) {
                numbers[i] = 400;
                numbers[i + 1] = 0;
            }
            if (numbers[i] == 100 && numbers[i + 1] == 1000) {
                numbers[i] = 900;
                numbers[i + 1] = 0;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}

//class TestD {                                        // Testing class
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        s.romanToInt("III");
//    }
//}