package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    // <T> is called generic, as T extends Player,
    // any other types (String, for example) cannot be used to create a Team instance
    // T can also be an interface rather than a class
    // interface themselves can also specify type parameters
    // multiple bounds is also allowed, like T extends Player & Coach & Manager
    // different bounds are connected by &
    // if we want to do so, class must be listed first, and then interfaces
    // only one class is allowed, but we can have multiple interfaces
    // in this example: T extends Player & Coach & Manager
    // T extends Player is a class, Coach and Manager are interfaces
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if (members.contains(player))
        {
            // System.out.println(player.getName() + " is already on this team");
            // java doesn't know what .getName() is since we don't specify the actual type of T

            // System.out.println(((Player) player).getName() + " is already on this team");
            // this is an available way to call .getName(), we cast T to Player
            // but this is very ugly
            System.out.println(((Player) player).getName() + " is already on this team");
            // this returns to be valid, because we have specified T extends Player
            return false;
        }
        else
        {
            members.add(player);
            // System.out.println(((Player) player).getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers()
    {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore)
    // use Team<T> instead of Team prevents the user to pass a Team with different type of players into this function
    {
        if (ourScore > theirScore) won++;
        else if (ourScore == theirScore) tied++;
        else lost++;
        if (opponent != null)
        {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking()
    {
        return (won * 2) + tied;
    }

    @Override
    // compareTo(): returns a negative number if this < the object passed-in
    // returns 0 if they are equal
    // returns a positive number if this > the object
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) return -1;
        // the reason why when 'this' is larger, we return -1 is that
        // we want the team with the highest score ranks first
        else if (this.ranking() < team.ranking()) return 1;
        return 0; // equal
    }
    // since we have implemented the compareTo() method, we can do:
    // ArrayList<Team> teams = new ArrayList<>();
    // Collections.sort(teams);
}
