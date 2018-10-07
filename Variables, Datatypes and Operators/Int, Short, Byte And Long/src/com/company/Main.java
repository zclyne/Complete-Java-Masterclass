package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myMinValue = -2147483648; // this is the smallest number that can fit in an integer
        int myMaxValue = 2147483647; // this is the maximum number that can fit in an integer
        int anotherMinValue = -2_147_483_648; // this is identical to myMinValue, '_' is used to make it more readable
        int myTotal = myMinValue / 2; // this is legal
        System.out.println(myTotal);

        // byte has a width of 8
        // byte is much more efficient that int for calculation
        byte myByteValue = 10; // byte type has a much smaller amount of space: -128 ~ 127
        // byte myNewByteValue = myByteValue / 2;
        // the above line is illegal
        // because by default in java, when you are making an assignment(myByteValue / 2)
        // java converts that to an integer
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println(myNewByteValue);
        // this is legal because we explicitly tells java to treat (myByteValue / 2) as a byte

        // short has a width of 16
        short myShortValue = 30000; // short: -32768 ~ 32767
        short myNewShortValue= (short) (myShortValue / 2); // this is the same as byte

        // long has a width of 64
        // a lowercase or uppercase 'L' must be put at the end of the number
        // to tell the computer that this is a long type number
        long myLongValue = 100L;

        // challenge
        byte byteNum = 120;
        short shortNum = 30000;
        int intNum = 100000;
        long res = 50000 + 10 * (byteNum + shortNum + intNum);
        // we don't need to explicitly convert these types into long
        // because long type can accept integer
    }
}
