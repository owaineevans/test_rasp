package com.aa;

/**
 * Base class - we use this so we can dependency inject the classes we need when unit testing
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Starting up");

        final Main main = new Main();
        main.run();
    }
}
