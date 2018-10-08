package com.company;

public class Main {

    public static void main(String[] args) { // this is a method with the name 'main'
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Chang", calculateHighScorePosition(1500));
        displayHighScorePosition("Lee", calculateHighScorePosition(900));
        displayHighScorePosition("Wang", calculateHighScorePosition(400));
        displayHighScorePosition("Chou", calculateHighScorePosition(50));
    }

    // we can't create a method inside of another method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    // a method returning type void is also called a procedure, and a method returning types other than void is also called a function
    public static void displayHighScorePosition(String playerName, int highScorePosition)
    {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score)
    {
//        if (score >= 1000) return 1;
//        else if (score >= 500) return 2;
//        else if (score >= 100) return 3;
//        return 4;
        int position = 4; // assuming position 4 will be returned
        if (score >= 1000) position = 1;
        else if (score >= 500) position = 2;
        else if (score >= 100) position = 3;
        return position;
    }
}
