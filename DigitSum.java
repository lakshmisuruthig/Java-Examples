package com.udemy.coding.exercise;

public class DigitSum {
public static int sumDigits (int number) {
	if(number<0) {
		return -1;
	}
	int sum=0;
	int digit=0;
	while(number>0) {
	digit =number%10;
	sum+=digit;
	number=number/10;
	
	}
	return sum;
}
	public static void main(String[] args) {
		System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));


	}

}
