package com.tutorials.queues.StandardQueue;

public class Driver {

    public static void main(String[] args) {
        StandardQueue queue = new StandardQueue(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
