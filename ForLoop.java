package com.udemyPractise;

public class ForLoop {
public static void calculateIntrest(double amount) {
	
	for(double i=8;i>1;i--) {//from 2 to 8 for(double i=2;i<9;i++)
		System.out.println(amount*(i/100));
	}

}
	public static void main(String[] args) {
		calculateIntrest(10000);

	}

}
