package com.leetcode.reverse_integer;

public class Testcase {
	public static void main(String[] args) {
		Solution s = new Solution();
		// TRY : 001
		// TRY : 002
		System.out.println(s.reverse(1534236469));
		// Expected(정답): 0, Output: 1056389759
		// 틀린 이유 : Overflow 때문임.
	}
}
