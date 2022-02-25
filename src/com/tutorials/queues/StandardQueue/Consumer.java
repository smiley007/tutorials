package com.tutorials.queues.StandardQueue;

public class Consumer implements Runnable {

    StandardQueue queue;

    Consumer(StandardQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1100);
                int val = queue.poll();
                System.out.println("Data fetched from queue : " + val);
            } catch (IllegalStateException e) {
                System.out.println("Exception occured while fetching data from queue :" + e.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
