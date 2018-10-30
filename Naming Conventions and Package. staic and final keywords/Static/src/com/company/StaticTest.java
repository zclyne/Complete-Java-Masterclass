package com.company;

import java.util.ArrayList;

public class StaticTest {
    // static variables(class variables) only have one copy in the memory
    // and all instances of the class share that one class variable
    private static int numInstances = 0;
    private String name;
    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    // It's good practice to set a method that only manipulate static variables to be static as well
    // therefore we can use StaticTest.getNumInstances() without having to create a new instance
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
