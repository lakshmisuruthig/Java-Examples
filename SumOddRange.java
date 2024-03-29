package com.udemy.coding.exercise;

public class SumOddRange {

	public static boolean isOdd(int number) {
		return ((number < 1) || number % 2 != 1) ? false : true;
	}

	public static int sumOdd(int start, int end) {
		if ((start < 1 || end < 1) || (end < start)) {
			return -1;
		}

		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));

	}

}
