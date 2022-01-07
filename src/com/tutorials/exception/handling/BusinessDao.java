package com.tutorials.exception.handling;

public class BusinessDao {

    public void fetchResource() {
        // received an exception
        try {
            do1();
        } catch (Exception ex) {
            throw new DataNotFoundException("Data was not found", ex);
        }
    }

    private void do1() {
        do2();
    }

    private void do2() {
        try {
            do3();
        } catch (Exception e) {
            throw new ServiceCallException("issue with the connection", e);
        }
    }

    private void do3() {
        do4();
    }

    private void do4() {
        do5();
    }

    private void do5() {
        throw new RuntimeException("No item found", new Exception("adsfasdfsadf"));
    }
}
