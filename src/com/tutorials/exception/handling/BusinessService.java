package com.tutorials.exception.handling;

public class BusinessService {

    private BusinessDao businessDao;

    BusinessService(BusinessDao businessDao) {
        this.businessDao = businessDao;
    }

    public void doSomething() {
        try {
            businessDao.fetchResource();
        } catch(DataNotFoundException ex) {
            System.out.println("service class - Data was not found " + ex.getCause());
            throw ex;
        } catch (Exception e) {
            System.out.println("Encountered exception");
        }
    }

}
