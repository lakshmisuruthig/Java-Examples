package com.udemy.coding.exercise;

public class EqualSumChecker {
public static boolean hasEqualSum(int a,int b,int c) {
	int sum=a+b;
	//System.out.println(sum);
	if(sum==c) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
	return true;
}
	public static void main(String[] args) {
		hasEqualSum(1,1,1);
		hasEqualSum(1,1,2);
		hasEqualSum(1,-1,0);
	}

}
