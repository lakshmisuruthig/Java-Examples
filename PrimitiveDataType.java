package com.udemyPractise;

public class PrimitiveDataType {
	public static void main(String[] args) {

		// Byte - 8 bits - width of 8

		byte b = 30;
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Minimum Byte Value is " + myMinByteValue + " Maximum Byte Value is " + myMaxByteValue);

		// Short - 16 bits - width of 16

		short s = 29;
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Minimum short Value is " + myMinShortValue + " Maximum short Value is " + myMaxShortValue);

		// char - 16 bits - 16 width of
		char c = 'D';// stores only one character(unicode characters)
		char myMinCharValue = Character.MIN_VALUE;
		char myMaxCharValue = Character.MAX_VALUE;
		System.out.println("Minimum char Value is " + myMinCharValue + " Maximum char Value is " + myMaxCharValue);

		// Integer - 32 bits - width of 32

		int i = 19;
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Minimum Integer Value is " + myMinIntValue + " Maximum Integer Value is " + myMaxIntValue);
		System.out.println("Busted Integer Max Value = " + (myMaxIntValue + 1));// Overflow occurs sets to -2147483648
		System.out.println("Busted Integer Min Value = " + (myMinIntValue - 1));// Underflow occurs sets to 2147483647

		// Float - 32 bits - width of 32

		float f = 24.000f;
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Minimum float Value is " + myMinFloatValue + " Maximum float Value is " + myMaxFloatValue);

		// Long - 64 bits - width of 64
		long l = 24L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Minimum long Value is " + myMinLongValue + " Maximum long Value is " + myMaxLongValue);

		// Double - 64 bits - width of 64

		double d = 24.000d;
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println(
				"Minimum double Value is " + myMinDoubleValue + " Maximum double Value is " + myMaxDoubleValue);

	}

}