package com.algorithm.problems.blockingqueue;

import sun.jvm.hotspot.utilities.MessageQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueImplementation {

    public static BlockingQueue<QueueMessage> blockingQueue = new ArrayBlockingQueue<QueueMessage>(10);
    public static int count = 1;

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread  consumer = new Thread(new Consumer());
        Thread  consumer2 = new Thread(new Consumer());

        producer.start();
        consumer.start();
        consumer2.start();

    }
}
