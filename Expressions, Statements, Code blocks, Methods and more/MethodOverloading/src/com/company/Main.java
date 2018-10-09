package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; // this is a constant.
    // final means that once we've assigned its value, we can't change it any more
    // namely, final converts it from variable to constant
    // method overloading: use the same method name but different parameters
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(0, -5);
        calcFeetAndInchesToCentimeters(15.2);
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) // the same method name, but only one parameter
    {
        System.out.println("Unnamed player" + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() // the same method name, but with no parameter
    {
        System.out.println("No player name, no player score.");
        return 0;
    }
    // only change the return type won't work. we have to change the number of parameters


    // challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if (feet < 0 || inches < 0 || inches > 12)
        {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (12 * feet + inches) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches < 0) return -1;
        double feet = (int) inches / 12;
        double remainingInches = inches - feet * 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
