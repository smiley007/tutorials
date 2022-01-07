package com.tutorials.interfaces.handling;

public interface Vehicle {

    void start();

    void stop();

    // provides default method implementation of interface (just like abstract class)
    default void connect() {
        System.out.println("Vehicle connected");
    }

    static int square(int x) {
        int res = x * x;
        System.out.println("Calculating square " + res);
        return res;
    }
}
