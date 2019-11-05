package com.algorithm.problems.blockingqueue;

public class Consumer implements Runnable{

    @Override
    public void run() {
        int messageCount = 0;
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            QueueMessage message = BlockingQueueImplementation.blockingQueue.poll();
            messageCount++;
            if (null != message) {
                System.out.println("Consumed " + message.getMessage());
            }
        }
    }
}
