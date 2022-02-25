package com.tutorials.queues.StandardQueue;

import java.util.LinkedList;

public class StandardQueue {

    private LinkedList queue;
    private int capacity;

    StandardQueue(int size) {
        capacity = size;
        queue = new LinkedList();
    }

    boolean offer(int val) {
        if (queue.size() > capacity)    return false;
        queue.add(val);
        return true;
    }

    int poll() {
        if (queue.size() == 0)  throw new IllegalStateException("Queue is empty");
        return (int) queue.poll();
    }

}
