package com.udemyPractise;

public class C3 {
	public static void main(String[] args) {
		double myFirstVariable = 20.00d;
		double mySecondVariable = 80.00d;
		double myTotal = (myFirstVariable + mySecondVariable) * 100.00;
		System.out.println(myTotal);
		double myThirdVariable = myTotal % 40.00;
		System.out.println(myThirdVariable);
		boolean isZero = true;
		if (myThirdVariable == 0) // boolean isZero =(myThirdVariable==0)?true:false;
			isZero = true;
		else
			isZero = false;

		System.out.println(isZero);
		if (!isZero) {
			System.out.println("Got Some Remainder");
		}
	}
}
