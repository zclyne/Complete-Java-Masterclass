package com.company;

// Polymorphism: assigning different functionality depending on the type of object that we've created
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws"); // call the constructor of the Movie class
    }
    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }
    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }
    @Override
    public String plot() {
        return "Kids try and excape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }
    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
    // No plot method
}

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i < 11; i++) {
	        Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                                ": " + movie.getName() + "\n" +
                                "Plot:" + movie.plot() + "\n");
            // for the Forgettable class, since there is no method called plot()
            // java looks for plot() in the class that Forgettable extends from
            // namely the Movie class
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1; // Math.random() returns a random double within [0, 1)
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws(); // we don't need break here because the last command is a return command
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}

