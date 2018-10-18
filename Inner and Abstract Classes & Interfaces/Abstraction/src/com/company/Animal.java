package com.company;

// interface can be seems as pure abstract
// difference between interface and abstract class:
// interface is completely abstract, and there's no implementation whatsoever
// abstract class allow us to implement some methods
// abstract class can have member variables that are inherited
// interface can have variables, but they are all public static final variables (constant)
// interface cannot have constructors
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // abstract methods must be implemented by subClasses
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
