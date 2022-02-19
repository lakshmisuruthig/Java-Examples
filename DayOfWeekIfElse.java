package com.udemy.coding.exercise;

public class DayOfWeekIfElse {
	public static void printDayOfTheWeek(int Day) {
		if (Day == 0) {
			System.out.println("Sunday");
		} else if (Day == 1) {
			System.out.println("Monday");
		} else if (Day == 2) {
			System.out.println("Tuesday");
		} else if (Day == 3) {
			System.out.println("Wednesday");
		} else if (Day == 4) {
			System.out.println("Thursday");
		} else if (Day == 5) {
			System.out.println("Friday");
		} else if (Day == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid day");
		}
	}

	public static void main(String[] args) {
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
		printDayOfTheWeek(7);

	}

}
