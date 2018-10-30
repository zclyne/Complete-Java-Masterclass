package com.company;

public class Main {

    public int multiplier = 7;

    public static void main(String[] args) {
	    StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances()); // 1

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances()); // 2

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumInstances()); // 3
        // notice that we still use secondInstance.getNumInstances() here, but the answer is 3
        // this is because all instances share the same static variable numInstances
        // but this is not recommended, the best way is to use thirdInstance instead

        // because getNumInstances() is public static, we can use the class name(StaticTest) to call it
        System.out.println(StaticTest.getNumInstances()); // 3

        // int answer = multiply(6); // get an error here
        // because main is static, and in a static method we can't call another non-static method
        // System.out.println(multiplier); // also get an error. The reason is the same.
        // but we can call static methods in non-static ones
    }

    public int multiply(int number) {
        return number * multiplier;
    }
}
