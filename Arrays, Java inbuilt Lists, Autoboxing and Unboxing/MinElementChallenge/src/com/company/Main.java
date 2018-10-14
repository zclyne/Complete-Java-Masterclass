package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // the scanner must be static here
    // because main() is static, so it can only access static fields
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine(); // each time the user has entered a number, call scanner.nextLine() to get rid of the enter key

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) if (array[i] < min) min = array[i];
        return min;
    }
}
