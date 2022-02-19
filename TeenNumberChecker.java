package com.udemy.coding.exercise;

public class TeenNumberChecker {
public static boolean hasTeen(int one,int two,int three) {
	if(one>=13&&one<=19) {
		System.out.println(true);
	}else if(two>=13&&two<=19) {
		System.out.println(true);
	}else if(three>=13&&three<=19) {
		System.out.println(true);	
	}else {
		System.out.println(false);
	}
	return true;
}
public static boolean isTeen(int age) {
	if(age>=13&&age<=19) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
	return true;
}
	public static void main(String[] args) {
		isTeen(9);
		isTeen(13);
		isTeen(7);
		hasTeen(9, 99, 19);
		hasTeen(23, 15, 42);
		hasTeen(22, 23, 34);

	}

}
