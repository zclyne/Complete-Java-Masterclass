package com.company;

public class Main {

    public static void main(String[] args) {
        // String does not belong to the 8 primitive data types

	    String myString = "This is a string";
        System.out.println("myString is equal to " + myString); // myString is equal to This is a string

        myString = myString + ", and this is more.";
        System.out.println(myString); // This is a string, and this is more.

        myString = myString + "\u00A9 2018";
        System.out.println(myString); // This is a string, and this is more.© 2018

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString); // 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString); // 1050
        // to add an integer to a string, java automatically converts the integer to string
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString); // 1050120.47
        // for double, it is the same as integer

    }
}
