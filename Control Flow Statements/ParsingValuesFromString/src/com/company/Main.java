package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString); // convert numberAsString to int
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString); // "20181"
        System.out.println(number); // 2019

        numberAsString = "2018a";
        // number = Integer.parseInt(numberAsString); // error

        numberAsString = "2018.125";
        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println(doubleNumber); // 2018.125
        // number = Integer.parseInt(numberAsString); // error
    }
}
