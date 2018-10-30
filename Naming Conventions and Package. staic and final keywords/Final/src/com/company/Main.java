package com.company;

public class Main {

    public static void main(String[] args) {
	    SomeClass one = new SomeClass("one");
	    SomeClass two = new SomeClass("two");
	    SomeClass three = new SomeClass("three");

		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());

		// one.instanceNumber = 4; // error, because instanceNumber is final
		System.out.println(Math.PI); // PI is a constant, and it's public static final
		// Math m = new Math(); // error, Math() is private

		// by setting a class to final, it prevents the class from being sub-classed
		// by setting methods to final, it prevents those methods from being overridden by subclasses

		int pw = 674312;
//		Password password = new Password(pw);
//		password.storePassword();
//		password.letMeIn(1);
//		password.letMeIn(523266);
//		password.letMeIn(9773);
//		password.letMeIn(0);
//		password.letMeIn(-1);
//		password.letMeIn(674312);

		Password password = new ExtendedPassword(pw);
		password.storePassword();
		password.letMeIn(1);
		password.letMeIn(523266);
		password.letMeIn(9773);
		password.letMeIn(0);
		password.letMeIn(-1);
		password.letMeIn(674312);

		System.out.println("Main method called");
		SIBTest test = new SIBTest();
		test.someMethod();
		System.out.println("Owner is " + SIBTest.owner);
		SIBTest anotherTest = new SIBTest(); // this time, the two SIBs are not called. Only the constructor is called
    }
}
