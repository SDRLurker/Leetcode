package com.leetcode.palindrome_number;

public class Solution {
    private int digits(int x) {
        int result = 0;
        while (x > 0) {
            x /= 10;
            result++;
        }
        return result;
    }
    public boolean isPalindrome(int x) {
        int high, low;
        if ( x < 0 ) return false;
        int digit = digits(x);
        while (x > 0) {
            low = x % 10;
            high = x / (int) Math.pow(10, digit - 1);
            if (high != low)    return false;
            x -= low;
            x -= high * (int) Math.pow(10, digit - 1);
            x /= 10;
            digit -= 2;
        }
        return true;
    }
}
