package com.algorithm.problems.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            QueueMessage message = new QueueMessage("Message:" + BlockingQueueImplementation.count++);
            try {
                Thread.sleep(i);
                System.out.println("Produced" + message.getMessage());
                BlockingQueueImplementation.blockingQueue.put(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
