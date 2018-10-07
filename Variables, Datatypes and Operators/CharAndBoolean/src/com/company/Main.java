package com.company;

public class Main {

    public static void main(String[] args) {
        // width of char is 16
	    char myChar = 's';
        char anotherChar = '\u00A9'; // 00A9 a unicode character
        System.out.println("Unicode output was: " + anotherChar);

        boolean myBoolean = true;
        boolean isMale = false;

        // challenge
        char rChar = '\u00AE';
        System.out.println("Register symbol: " + rChar);
    }
}
