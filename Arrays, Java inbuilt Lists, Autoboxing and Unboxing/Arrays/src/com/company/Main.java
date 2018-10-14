package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int [] myIntArray = new int[10]; // create an array
        myIntArray[5] = 50; // set value
        int [] anotherIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // one way to initialize an array
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]); // 50
        for (int i = 0; i < myIntArray.length; i++) myIntArray[i] = i * 10; // use a loop to set values in an array

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);

        int[] myIntegersCopy = Arrays.copyOf(myIntegers, myIntegers.length); // a built-in method that copies an array
        printArray(myIntegersCopy);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) values[i] = scanner.nextInt();
        return values;
    }
}
