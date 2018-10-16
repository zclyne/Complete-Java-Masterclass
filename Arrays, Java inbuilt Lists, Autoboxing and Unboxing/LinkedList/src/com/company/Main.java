package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; // doesn't create a separate class
        // just point to the same address as customer
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance()); // 12.18

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));
        }

        // ArrayList is not proper for inserting and removing elements
        // LinkedList is much better for such operations
        // LinkedList actually stores the link to the next item in the list as well as the value
    }
}
