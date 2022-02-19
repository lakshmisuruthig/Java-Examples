package com.udemy.coding.exercise;

public class isEvenNumber {
public static boolean isEvenNumber(int number) {
	return((number%2==0)?true:false);
	}

	public static void main(String[] args) {
	int number = 4;
	int finishNumber = 20;
	while(number<=finishNumber) {
		number++;
		if(!isEvenNumber(number)) {
			continue;
		}
System.out.println(number);
	}

}
}
