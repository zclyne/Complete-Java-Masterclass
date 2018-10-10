package com.company;

// for class:
// public: unrestricted access to the class
// private: no other classes can access that class
// protected: classes in this package can access that class
public class Car {
    // for variables:
    // private: don't allow a class outside of the Car class to access this variable
    // public: any other classes can access this variable
    // protected: only the subClasses of this class or classes in the same package can access this variable
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    // the above variables are also called fields

    // the following function is also called a setter
    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) //String.equals() is used to determine whether two strings are the same. DO NOT USE == TO COMPARE STRINGS!!!
            this.model = model;
        else
            this.model = "unknown";
    }

    // the following function is also called a getter
    public String getModel()
    {
        return this.model;
    }
}
