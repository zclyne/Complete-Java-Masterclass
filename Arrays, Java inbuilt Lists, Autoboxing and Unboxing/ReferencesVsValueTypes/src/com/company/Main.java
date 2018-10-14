package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // value type
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 10
        // both variables got the value of 10
        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 11

        // reference type
        // holds the reference to the address of the object
        // rather than store the object itself
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        // Arrays.toString() converts an array to a string with the format like "[1, 2, 3, ...]"
        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // [0, 0, 0, 0, 0]

        anotherArray[0] = 1;
        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray)); // [1, 0, 0, 0, 0]
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray)); // [1, 0, 0, 0, 0]
        // both arrays changed at the index of 0
        // both arrays point to the same address in the memory

        modifyArray(myIntArray);
        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray)); // [1, 2, 0, 0, 0]
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray)); // [1, 2, 0, 0, 0]

        anotherArray = new int[] {5, 6, 7, 8, 9};
        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray)); // [1, 2, 0, 0, 0]
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray)); // [5, 6, 7, 8, 9]
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
        array = new int[] {1, 2, 3, 4, 5}; // de-referencing
        System.out.println("array = " + Arrays.toString(array)); // [1, 2, 3, 4, 5]
        // the reference 'array' here do point to a new array, but myIntArray and anotherArray won't change at all
    }
}
