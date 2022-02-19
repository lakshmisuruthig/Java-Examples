package com.udemy.coding.exercise;

public class InchestoCentimeters {
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		double centimeters =(feet*12)*2.54;
		centimeters+=inches*2.54;
		System.out.println("feet = "+feet+"inches = "+inches+"centimeters = "+centimeters);
		
		
		if(feet>=0) {
			
			return feet;
		}
		else if(inches>=0 && inches<=12) {
			
			return inches;
		}
		else {
			return -1;
		}
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		double feet =(int) inches/12;
		double remainingInches=(int) inches%12;
		System.out.println(remainingInches);
		if(inches>=0) {
			return inches;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(6,0);
		calcFeetAndInchesToCentimeters(2);

	}

}
