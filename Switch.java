package com.udemyPractise;

public class Switch {
	public static void main(String[] args) {
		String value = "ABC";
		switch (value) {
		case "ABC":
			System.out.println("Found A");
			break;
		case "B":
			System.out.println("Found B");
		default:
			System.out.println("Not Found");
		}
	}

}
