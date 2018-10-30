package com.company;

public class SIBTest {
    public static final String owner;

    // this is a static initialization block
    // it is used to initialize static final variables
    // it is called only once when the class the imported
    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    // a constructor is called everytime a new instance is created
    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    // although this static initialization block is put after the constructor
    // it is executed before the constructor when a new instance is created
    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
