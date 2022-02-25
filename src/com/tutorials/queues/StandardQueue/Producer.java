package com.tutorials.queues.StandardQueue;

public class Producer implements Runnable {

    StandardQueue queue;

    Producer(StandardQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("Generating value from producer : " + count);
            queue.offer(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
