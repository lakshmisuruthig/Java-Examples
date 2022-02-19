package com.udemy.coding.exercise;

public class BarkingDog {
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (barking) {
			if (hourOfDay < 0 || hourOfDay > 23) {
				System.out.println(!barking);
			} else if ((hourOfDay < 8 || hourOfDay > 22)) {
				System.out.println(barking);
			} else {
				System.out.println(!barking);
			}
		} else {
			System.out.println("dog is not barking");
		}
		return barking;
	}
//	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        if ((hourOfDay < 0)||(hourOfDay > 23)){
//            System.out.println(true);
//            return true;
//        }
//
//        System.out.println(false);
//        return true;
//    }
	public static void main(String[] args) {
		shouldWakeUp(true, 1);
		shouldWakeUp(false, 2);
		shouldWakeUp(true, 8);
		shouldWakeUp(true, -1);

	}

}
