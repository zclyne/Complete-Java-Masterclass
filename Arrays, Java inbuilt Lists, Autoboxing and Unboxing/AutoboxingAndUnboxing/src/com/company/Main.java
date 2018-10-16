package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList<int> intArrayList = new ArrayList<int>(); // wrong. because int is not a class, it's a primitive type
        // Integer integer = new Integer(54); // Integer is a class, and it is the wrapper of int, but this is not a good way
        Integer integer = 54; // this is the better way to define an Integer
        // Double doubleValue = new Double(12.25); // the same, not a good way
        Double doubleValue = 12.25; // good way
        ArrayList<Integer> intArrayList = new ArrayList<Integer>(); // this works will
        for (int i = 0; i < 10; i++)
        {
            intArrayList.add(Integer.valueOf(i));
            // autoboxing
            // Integer.valueOf(int) takes an int and returns an Integer with the same value
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println(intArrayList.get(i).intValue());
            // unboxing
            // .intValue() returns an int with the same value as the current Integer
        }

        // better way
        Integer myIntValue = 56; // Integer.valueOf(56)
        int myInt = myIntValue; // identical to myIntValue.intValue(). java automatically converts the Integer to int

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10; dbl += 0.5)
        {
            // myDoubleValues.add(Double.valueOf(dbl)); // not a good way
            myDoubleValues.add(dbl); // better
        }
        for (int i = 0; i < myDoubleValues.size(); i++)
        {
            // double value = myDoubleValues.get(i).doubleValue(); // not a good way
            double value = myDoubleValues.get(i); // better
            System.out.println(i + " ---> " + value);
        }
    }
}
