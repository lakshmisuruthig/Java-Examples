package com.udemy.coding.exercise;

public class SpeedConverter {
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		}

		return Math.round(kilometersPerHour / 0.6213711922);

	}

	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + "km/h= " + milesPerHour + "mi/h");
		}
	}

	public static void main(String[] args) {
		toMilesPerHour(1.5);
		printConversion(1.5);
		toMilesPerHour(10.25);
		printConversion(10.25);
		toMilesPerHour(-5.6);
		printConversion(-5.6);
		toMilesPerHour(75.114);
		printConversion(75.114);

	}

}
