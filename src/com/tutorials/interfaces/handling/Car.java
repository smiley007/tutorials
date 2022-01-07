package com.tutorials.interfaces.handling;

public class Car implements Vehicle, Alarm {

    @Override
    public void start() {
        System.out.println("Vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.connect();
        Vehicle.square(12);
        // default methods in interfaces allows common implementation present in diff interfaces to be inherited
        // which was not possible in abstract classes
        car.startAlarm();
    }
}
