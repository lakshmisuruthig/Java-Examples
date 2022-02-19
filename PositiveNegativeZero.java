package com.udemy.coding.exercise;

public class PositiveNegativeZero {

	public static void checkNumber(int number) {

		if (number > 0) {
			System.out.println("Positive");
		} else if (number < 0) {
			System.out.println("Negative");
		} else if (number == 0) {
			System.out.println("Zero");
		}

	}

	public static void main(String[] args) {
		checkNumber(100);
		checkNumber(0);
		checkNumber(-200);

	}

}
