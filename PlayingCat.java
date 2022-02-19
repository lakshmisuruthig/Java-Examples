package com.udemy.coding.exercise;

public class PlayingCat {
public static boolean isCatPlaying(boolean summer,int temperature) {
	if(temperature>=25 && temperature<=35) {
		System.out.println(true);
	}else if(temperature<=45) {
		System.out.println(false); 
	}
	return true;
}
	public static void main(String[] args) {
		isCatPlaying(true,10);
		isCatPlaying(false,36);
		isCatPlaying(false,35);

	}

}
