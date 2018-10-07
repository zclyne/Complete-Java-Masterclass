package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 2; // the answer is 2

        // width of float = 32
	    float myFloatValue = 5f; // put an 'f' at the end to tell the computer that it is a float number
        // float anotherFloatValue = 5.4; // illegal, because 5.4 is double
        // use (float) 5.4 or 5.4f instead

        // width of double = 64
        double myDoubleValue = 5d; // the same
        // double anotherDoubleValue = 5.25; // a decimal number will be automatically views as double by java
        // double is more precise than float, but is also faster
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue" + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
