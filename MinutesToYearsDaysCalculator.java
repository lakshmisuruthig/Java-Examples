package com.udemy.coding.exercise;

public class MinutesToYearsDaysCalculator {
	private static final String INVALID_MESSAGE ="Invalid Value";
	public static void printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println(INVALID_MESSAGE);
		}
		long hours = minutes / 60;
		long day = hours/24;
		
		long years =day/365;
		String minutesString =minutes+" min";
		if(minutes<10) {
			minutesString="0"+minutesString;
		}
		String yearString =years+" y";
		if(years<10) {
			yearString="0"+yearString;
		}
		if(day>=365) {
			day=day%365;
		}
		String dayString =day+" d";
		if(day<10) {
			dayString="0"+dayString;
		}
		System.out.println(minutesString+" = "+yearString+" and "+dayString);
	}
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);

	}

}
