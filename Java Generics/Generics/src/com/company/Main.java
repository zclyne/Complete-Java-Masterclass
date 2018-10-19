package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // ArrayList items = new ArrayList(); // as we don't specify the type, items can contain any type
		// it is called raw type, and it is not recommended
		ArrayList<Integer> items = new ArrayList<>(); // this way is recommended
	    items.add(1);
	    items.add(2);
	    items.add(3);
	    items.add(4);
	    items.add(5);
	    // items.add("tim");
		// if we use the first method to define items
		// we will get an exception because we try to convert a String to an Integer
		// if we use the second method, IntelliJ will not allow us to do that
	    printDoubled(items);


	    FootballPlayer joe = new FootballPlayer("Joe");
	    BaseballPlayer pat = new BaseballPlayer("Pat");
	    SoccerPlayer beckham = new SoccerPlayer("Beckham");

	    Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
	    adelaideCrows.addPlayer(joe);
	    // adelaideCrows.addPlayer(pat); // invalid
	    // adelaideCrows.addPlayer(beckham); // invalid
		System.out.println(adelaideCrows.numPlayers());

		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cus");
		baseballTeam.addPlayer(pat);

    }

//    private static void printDoubled(ArrayList n)
//    {
//        for (Object i : n)
//		{
//			System.out.println((Integer) i * 2);
//			// Integer here tells java what the type of i is
//		}
//    }

	private static void printDoubled(ArrayList<Integer> n)
	{
		for (Integer i : n) System.out.println(i * 2);
	}
}
