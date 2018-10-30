package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theater theater = new Theater("Olympian", 8, 12);
// 	    theater.getSeats();
//	    if (theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats); // this is a shallow copy
        printList(seatCopy);
        // seatCopy and theater.seats share the same data
        seatCopy.get(1).reserve();
        if (theater.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved"); // this will be executed
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy); // reversed
        System.out.println("Printing theater.seats");
        printList(theater.seats); // not reversed

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy); // shuffled
        System.out.println("Printing theater.seats");
        printList(theater.seats); // not shuffled

        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber()); // A01
        System.out.println("Max seat number is " + maxSeat.getSeatNumber()); // H12

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

        List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
        // Collections.copy(newList, theater.seats); // get error
        // this is because it only sets the capacity of the ArrayList, but it doesn't create 96 elements in newList
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=========================================================");
    }

    public static void sortList(List<? extends Theater.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
