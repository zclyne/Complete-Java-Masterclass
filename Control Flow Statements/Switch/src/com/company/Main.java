package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int switchValue = 5;
        switch(switchValue) // acceptable types here: byte, short, char and int
        {
            case 1: // if switchValue == 1
                System.out.println("Value = 1");
                break; // jump to more code outside of switch, otherwise it will continue to excute the commands in the next case
            case 2: // if switchValue == 2
                System.out.println("Value = 2");
                break;
            case 3: case 4: case 5: // if switchValue == 3 or 4 or 5
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                // break; // this break is not necessary because it is at the end of the switch block
        }
        // more code here

        String month = "January";
        month.toLowerCase(); // toLowerCase() is a method provided by String class
        // it is necessary to convert month to lower case because in java, January is different to january
        switch(month) // switch String is added in JDK 7, so make sure that we use the correct JDK version here.
        {
            case "january":
                System.out.println("Jan");
                break;
            case "jun":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }

        // challenge
        char switchChar = 'A';
        switch(switchChar)
        {
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C':
                System.out.println("C is found");
                break;
            case 'D':
                System.out.println("D is found");
                break;
            case 'E':
                System.out.println("E is found");
                break;
            default:
                System.out.println("Not found");
        }

        // string operation
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); // true
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true
    }
}
