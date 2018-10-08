package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if (score < 5000)
            System.out.println("Your score was less than 5000.");
        else
            System.out.println("Got here");

        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // int savedFinalScore =finalScore; // cannot access finalScore because it was created in the if code block and has been destroyed
    }
}
