package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(1 + 2); // 3
        System.out.println("1 + 2 = " + 1 + 2); // 1 + 2 = 12
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result); // 1 + 2 = 3
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result); // 3 - 1 = 2
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result); // 2 * 10 = 20
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result); // 20 / 5 = 4
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result); // 4 % 3 = 1
        previousResult = result;
        result++;
        System.out.println("result is now " + result); // result is now 2
        result += 2;
        System.out.println("result is now " + result); // result is now 4
        result *= 10;
        System.out.println("result is now " + result); // result is now 40
        result -= 10;
        System.out.println("result is now " + result); // result is now 30
        result /= 10;
        System.out.println("result is now " + result); // result is now 3

        boolean isAlien = true;
        if (isAlien) System.out.println("It is not an alien!");
        else System.out.println("It is an alien!");

        int topScore = 80;
        if (topScore != 100)
            System.out.println("You didn't get the high score!");
        else
            System.out.println("You got the high score!");
        int secondTopScore = 60;
        // AND operator: &&
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than the second top score and less than 100");
        // OR operator : ||
        if (topScore > 90 || secondTopScore <= 90)
            System.out.println("One of these tests is true");

        boolean isCar = false;
        if (isCar = true)
            System.out.println("This is not supposed to happen");
        // the above line will be displayed on the screen because isCar = true returns true

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");
    }
}
