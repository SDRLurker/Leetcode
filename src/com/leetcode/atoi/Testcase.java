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
		// TRY : 005
		System.out.println(s.myAtoi("2147483648"));
		// Expected(정답): 2147483647, Output: -2147483648
		// TRY : 006
		System.out.println(s.myAtoi("      -11919730356x"));
		// Expected(정답): -2147483648, Output: -6
	}
}
