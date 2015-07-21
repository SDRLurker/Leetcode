package com.leetcode.palindrome_number;

public class Testcase {
	public static void main(String[] args) {
		Solution s = new Solution();
		// TRY:001
		System.out.println(s.isPalindrome(-2147483648));
		// Expected(정답): false, Output: true 
		// TRY:002
		System.out.println(s.isPalindrome(-101));
		// Expected(정답): false, Output: true
		// TRY:003
		System.out.println(s.isPalindrome(121));
		// Expected(정답): true, Output: false
		// TRY:004
		System.out.println(s.isPalindrome(1000021));
		// Expected(정답): false, Output: true
	}
}
