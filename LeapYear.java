package com.udemy.coding.exercise;

public class LeapYear {
	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0 && (year%100 !=0 || year%400==0)) {
				
				System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}else {
		System.out.println(false);
	}
		return true;
	}
	public static void main(String[] args) {
		isLeapYear(-1600);
		isLeapYear(1600);
		isLeapYear(2017);
		isLeapYear(2000);
		isLeapYear(-1200);
		isLeapYear(-1900);
	}

}
