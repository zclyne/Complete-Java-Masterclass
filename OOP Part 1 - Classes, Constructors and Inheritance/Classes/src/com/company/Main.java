package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car(); // always use the new keyword to create an instance of a class
        Car holden = new Car();
        System.out.println("Model is " + porsche.getModel()); // Model is null
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel()); // Model is Carrera
    }
}
