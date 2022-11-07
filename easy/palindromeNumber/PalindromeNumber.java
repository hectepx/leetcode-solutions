package com.leetcode.easy.palindromeNumber;

import java.util.Arrays;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        boolean flag = false;
        while (x > 0) {
            int[] array = new int[(int) (Math.log10(x) + 1)];
            System.out.println(Arrays.toString(array));
            for (int i = array.length - 1; i >= 0; i--) {
                array[i] = x % 10;
                x = x / 10;
            }
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[array.length - 1 - i]) {
                    count++;
                }
            }
            if (count >= array.length / 2 +1) flag = true;

            System.out.println(Arrays.toString(array));
            System.out.println(flag);
        }
        return flag;
    }
}

class PalidromeTest {
    public static void main(String[] args) {
        PalindromeNumber.isPalindrome(
                1000021);
    }
}
