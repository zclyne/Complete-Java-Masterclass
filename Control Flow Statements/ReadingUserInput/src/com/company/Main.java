package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in); // System.in allows you to type the input into the console
        // new is used to create an instance of a Scanner
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); // scanner.hasNextInt() checks if the next input is a number
        if (hasNextInt)
        {
            int yearOfBirth = scanner.nextInt(); // what the user has typed is automatically converted into an int
            scanner.nextLine(); // this is used to handle the enter key that we pressed after input the number
            // the above line is necessary
            // add scanner.nextLine() every time we read a number from the console

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // read a line of input from the console
            int age = 2018 - yearOfBirth;
            if (age >= 0 && age <= 100) System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            else System.out.println("Invalid year of birth.");
        }
        else
        {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close(); // after we close the scanner, calling methods like scanner.nextLine() will cause errors

        // Integer.MAX_VALUE is the maximum value an int can hold
        // Integer.MIN_VALUE is the same
    }
}