package com.leetcode.easy.palindromeNumber;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

        if (x == 0) return true;
        if (x < 0) return false;
        boolean flag = false;


        int[] array = new int[(int) (Math.log10(x) + 1)];

        if (array.length == 1) return true;

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = x % 10;
            x = x / 10;
        }

        int boom = array.length;
        int count = 0;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[boom - 1]) {
                boom -= 1;
                count ++;
            }
        }

        if (count == array.length/2) flag = true;

        return flag;
    }
}

class PalidromeTest {
    public static void main(String[] args) {
        PalindromeNumber.isPalindrome(
                1001);
    }
}
