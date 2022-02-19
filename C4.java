package com.udemyPractise;

public class C4 {
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your First Score was " + finalScore);
		}

		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your First Score was " + finalScore);
		}
	}
}
