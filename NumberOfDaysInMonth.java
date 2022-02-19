package com.udemy.coding.exercise;

public class NumberOfDaysInMonth {
	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {

				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public static int getDaysInMonth(int month, int year) {
		if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
			return -1;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}

		}
		return year;
	}

	public static void main(String[] args) {
//		isLeapYear(-1600);
//		isLeapYear(1600);
//		isLeapYear(2017);
//		isLeapYear(2000);
		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));

	}

}
