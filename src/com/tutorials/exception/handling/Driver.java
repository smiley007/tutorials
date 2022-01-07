package com.tutorials.exception.handling;

public class Driver {

    public static void main(String[] args) {
        BusinessDao businessDao = new BusinessDao();
        try {
            BusinessService businessService = new BusinessService(businessDao);
            businessService.doSomething();
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}
