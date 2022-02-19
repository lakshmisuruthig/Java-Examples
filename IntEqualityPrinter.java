package com.udemy.coding.exercise;

public class IntEqualityPrinter {
	private static final String INVALID_MESSAGE = "Invalid Value";
	private static final String EQUAL_MESSAGE = "All numbers are equal";
	private static final String UNEQUAL_MESSAGE = "All numbers are different";
	private static final String NEITHEREQUAL_MESSAGE = "Neither all are equal or different";

	public static void printEqual(int x, int y, int z) {
		if (x < 0 || y < 0 || z < 0) {
			System.out.println(INVALID_MESSAGE);
		} else if (x == y && y == z && z == x) {
			System.out.println(EQUAL_MESSAGE);
		} else if (x == y || y == z || z == x) {
			System.out.println(NEITHEREQUAL_MESSAGE);
		} else {
			System.out.println(UNEQUAL_MESSAGE);
		}
	}

	public static void main(String[] args) {
		printEqual(1, 1, 1);
		printEqual(1, 1, 2);
		printEqual(-1, -1, -1);
		printEqual(1, 2, 3);

	}

}
