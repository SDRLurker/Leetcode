package com.leetcode.atoi;

public class Testcase {
	public static void main(String[] args) {
		Solution s = new Solution();
        // TRY : 001
		System.out.println(s.myAtoi("+1"));
        // Expected(정답): 1, Output: 0
		// TRY : 002
		System.out.println(s.myAtoi("-1"));
		// Expected(정답): -1, Output: 0
		// TRY : 003
		System.out.println(s.myAtoi("+-2"));
		// Expected(정답): 0, Output: -2
		// TRY : 004
		System.out.println(s.myAtoi("2147483648"));
		// Expected(정답): 2147483647, Output: -2147483648
	}
}
