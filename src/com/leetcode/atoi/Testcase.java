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
	}
}
