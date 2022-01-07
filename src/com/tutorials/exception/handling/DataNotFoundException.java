package com.tutorials.exception.handling;

public class DataNotFoundException extends RuntimeException {

    DataNotFoundException() { super(); }

    DataNotFoundException(String message) { super(message); }

    DataNotFoundException(String message, Throwable cause) { super(message, cause); }

    DataNotFoundException(Throwable cause) { super(cause); }
}
