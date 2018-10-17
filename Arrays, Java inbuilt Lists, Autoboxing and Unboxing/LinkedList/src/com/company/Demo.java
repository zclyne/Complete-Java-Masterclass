package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        addInOrder(placesToVisit, "Apple");
        addInOrder(placesToVisit, "Shanghai");

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList)
    {
        // using iterator is another way to access every element in a list/map/set, etc.
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext())
        while (i.hasNext())
            System.out.println("Now visiting " + i.next()); // i.next() returns the current value and changes the iterator to point to the next one
        System.out.println("===================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
            // .compareTo() returns 0 if the two objects are equal
            // returns a positive number if newCity > the current city
            // returns a negative number if newCity < the current city
            if (comparison == 0)
            {
                // equal, do not add
                System.out.println(newCity + "is already included as a destination");
                return false;
            }
            else if (comparison > 0)
            {
                // new city should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); // go back to the previous entry because .next() changes the iterator to the next one
                stringListIterator.add(newCity); // add newCity to the current entry
                return true;
            }
            else if (comparison < 0)
            {
                // move on to the next city
                // don't need to do anything because we've already called .next() at the beginning
            }
        }

        stringListIterator.add(newCity); // newCity should be appended to the end of the linkedList
        return true;
    }

    private static void visit(LinkedList<String> cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; // we should track the direction
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.getFirst().isEmpty())
        {
            System.out.println("No cities in the itinerary");
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action)
            {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward)
                    {
                        if (listIterator.hasNext())
                            listIterator.next();
                        goingForward = true;
                    }
                    if (listIterator.hasNext())
                    {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else
                    {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward)
                    {
                        if (listIterator.hasPrevious())
                            listIterator.previous();
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else
                    {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n" +
                            "1 - go to next city\n" +
                            "2 - go to previous city" +
                            "3 - print menu options");
    }
}
