package com.tutorials.interfaces.handling;

public interface Alarm {

    default void startAlarm() {
        System.out.println("Alarm started");
    }
}
