package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    // the resizing of an ArrayList is automatically handled by the computer
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit)
        {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("0 - print choice options.");
        System.out.println("1 - print the list of grocery items.");
        System.out.println("2 - add an item.");
        System.out.println("3 - modify an item.");
        System.out.println("4 - remove an item.");
        System.out.println("5 - search for an item.");
        System.out.println("6 - quit.");
    }

    public static void addItem()
    {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.println("Enter the item name to modify: ");
        String oldItem = scanner.nextLine();
        System.out.println("Enter new item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem()
    {
        System.out.println("Enter the item to remove: ");
        String item = scanner.nextLine();
        scanner.nextLine(); // get rid of the enter key after the int
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem()
    {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem))
            System.out.println("Found " + searchItem + " in our grocery list");
        else
            System.out.println(searchItem + " is not in the shopping list");
    }

    public static void processArrayList()
    {
        // two identical ways to copy an ArrayList
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        // .addAll() appends all of the elements in the specified collection to the end of this list

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        // create a new ArrayList with the contents of groceryList

        String[] myArray = new String[groceryList.getGroceryList().size()];
        groceryList.getGroceryList().toArray(myArray);
        // .toArray() converts an ArrayList to a regular array and stores it in myArray
    }
}
