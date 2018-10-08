package com.company;

public class Main {

    public static void main(String[] args) {
	    int myVariable = 50; // the entire line is a statement which also contains an expression
        myVariable++; // this is also a statement
        System.out.println("This is a test."); // this is also a statement
        System.out.println("This is" + // the 3 lines altogether is a statement
                " another " +
                "still more.");
        int anotherVariable = 50; myVariable--; // there are 2 statements in one line
        
    }
}
