package com.udemy.coding.exercise;

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
		int a = (int) Math.round(one * 1000);
		int b = (int) Math.round(two * 1000);
		System.out.println(a);
		System.out.println(b);
		if (a == b) {
			System.out.println(true);
			return true;
		} else

			System.out.println(false);
		return false;
	}

	public static void main(String[] args) {
		areEqualByThreeDecimalPlaces(-3.1756, -3.175); 
		areEqualByThreeDecimalPlaces(3.175, 3.176); 
		areEqualByThreeDecimalPlaces(3.0, 3.0); 
		areEqualByThreeDecimalPlaces(-3.123, 3.123);

	}

}
