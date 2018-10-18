package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
	    Gearbox mcLaren = new Gearbox(6);
	    // Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
	    // because Gear is an inner class, we need to specify the outer class, namely Gearbox
        // at the right end of the equation, use the instance name.new (macLaren.new Gear)
        // rather than the class name(new Gearbox.Gear)
        // otherwise you will get an error
        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4); // wrong
        // Gearbox.Gear third = new mcLaren.Gear(3, 17.8); // wrong
        // System.out.println(first.driveSpeed(1000));

//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

        // the following is a local class
        // it is defined inside of a method
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        // the following is an anonymous class
        // it can be used only once as it has no name
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
