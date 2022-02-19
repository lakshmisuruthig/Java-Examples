package com.udemyPractise;

public class C5 {
	public static void displayHighScorePosition(String playerName, int highScore) {
		System.out.println(playerName + " managed to get into position " + highScore + " on the high score table");
	}

	public static int calculateHighScorePosition(int highScore) {
		if (highScore > 1000) {
			return 1;
		} else if (highScore > 500 && highScore < 1000) {
			return 2;
		} else if (highScore > 100 && highScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}

	public static void main(String[] args) {

		int highScore = calculateHighScorePosition(1500);
		displayHighScorePosition("Lakshmi", highScore);

		highScore = calculateHighScorePosition(900);
		displayHighScorePosition("Suruthi", highScore);

		highScore = calculateHighScorePosition(400);
		displayHighScorePosition("Parvathi", highScore);

		highScore = calculateHighScorePosition(50);
		displayHighScorePosition("Anand", highScore);

	}

}