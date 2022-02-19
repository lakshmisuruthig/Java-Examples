package com.udemy.coding.exercise;

public class FirstLastDigitSum {
public static int sumFirstAndLastDigit(int number){
	if(number<0) {
		return -1;
	}
	int lastDigit=0;
	if(number>=0) {
		lastDigit=number%10;
	}
	while(number>9) {
		number/=10;
	}
	return(number+lastDigit);
}
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(10));
		System.out.println(sumFirstAndLastDigit(99));
		System.out.println(sumFirstAndLastDigit(-10));
	}

}
