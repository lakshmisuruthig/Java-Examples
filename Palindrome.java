package com.udemy.coding.exercise;

public class Palindrome {
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int lastDigit = 0;
		if (number < 0) {
			number *= -1;
		}
		int storedNumber = number;
		while (storedNumber > 0) {
			lastDigit = storedNumber % 10;
			reverse = (reverse * 10) + lastDigit;
			storedNumber = storedNumber / 10;
		}
		//System.out.println(number);
		//System.out.println(reverse);
		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome(11212));
	}
}
