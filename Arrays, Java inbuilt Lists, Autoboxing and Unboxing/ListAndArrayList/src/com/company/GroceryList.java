package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList()
    {
        return groceryList;
    }

    public void addGroceryItem(String item)
    {
        groceryList.add(item); // .add() automatically adds the item to the end the ArrayList
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        // .size() returns how many elements you've currently stored in the ArrayList
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println((i + 1) + ". " + groceryList.get(i)); // we use .get() to access an element in the ArrayList
        }
    }

    public void modifyGroceryItem(String oldItem, String newItem)
    {
        int position = findItem(oldItem);
        if (position >= 0)
            modifyGroceryItem(position, newItem);
    }

    private void modifyGroceryItem(int position, String newItem)
    {
        groceryList.set(position, newItem); // .set() replaces an existing item at index = position with the new item
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item)
    {
        int position = findItem(item);
        if (position >= 0)
            removeGroceryItem(position);
    }

    private void removeGroceryItem(int position)
    {
        String theItem = groceryList.get(position); // the item that will be removed from the ArrayList
        groceryList.remove(position); // .remove() removes an item at the given position from the ArrayList
    }

    private int findItem(String searchItem)
    {
        // boolean exists = groceryList.contains(searchItem); // .contains() returns true if the ArrayList contains the specific item
//        int position = groceryList.indexOf(searchItem); // .indexOf() returns the index if the item is in the ArrayList, otherwise it returns -1
//        if (position >= 0) // successfully find the item
//            return groceryList.get(position);
//        return null; // searchItem is not in the ArrayList
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem)
    {
        int position = findItem(searchItem);
        if (position >= 0)
            return true;
        return false;
    }
}
