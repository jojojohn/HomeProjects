package com.algorithm.problems.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueue<T> {

    private Queue<T> queue;
    private int limit;

    MyBlockingQueue(final int limit) {
        this.limit = limit;
        this.queue = new LinkedList<>();
    }

    public synchronized void enqueue(T value) throws InterruptedException {
        while (queue.size() == limit) {
            wait();
        }

        if (queue.size() == 0) {
            notifyAll();
        }

        this.queue.add(value);
    }

    public synchronized T dequeue() throws InterruptedException {
        while (queue.size() == 0) {
            wait();
        }

        if (queue.size() == this.limit) {
            notifyAll();
        }

        return this.queue.poll();
    }
}
