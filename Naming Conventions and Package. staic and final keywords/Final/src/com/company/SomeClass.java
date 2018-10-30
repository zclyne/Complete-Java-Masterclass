package com.company;

public class SomeClass {
    private static int classCounter = 0;
   //  public final int instanceNumber = 1; // this is one way to initialize a final variable
   public final int instanceNumber;
    private final String name;

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public SomeClass(String name) {
        this.name = name;// since name is not initialized before, we can initialize it in the constructor
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }
}
