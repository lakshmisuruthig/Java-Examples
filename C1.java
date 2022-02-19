package com.udemyPractise;

public class C1 {
	public static void main(String[] args) {
		byte myByteValue = 100;
		short myShortValue = 10000;
		int myIntValue = 99999999;
		long myLongValue = 50000l + (10l * (myByteValue + myShortValue + myIntValue));
		System.out.println(myLongValue);
	}
}