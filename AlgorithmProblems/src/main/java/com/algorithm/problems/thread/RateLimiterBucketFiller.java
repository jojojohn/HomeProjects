package com.algorithm.problems.thread;

import java.util.LinkedList;
import java.util.List;

public class RateLimiterBucketFiller {

    private static final Long MAXTOKEN = 5L;
    Long possibleTokensFilled = 0L;
    private Long lastRequestedTime = System.currentTimeMillis();

    RateLimiterBucketFiller() {

    }

    public static void main(String[] args) throws InterruptedException {
        RateLimiterBucketFiller bucket = new RateLimiterBucketFiller();
        bucket.initialize();
        List<Thread> threads = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(() -> {
                try {
                    bucket.getTokens();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            });
            threads.add(t1);
        }

        threads.stream().forEach(t -> t.start());
        threads.stream().forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


    }

    public void initialize() {
        Thread t = new Thread(() -> {
            daemonThread();
        });
        t.setDaemon(true);
        t.start();
    }

    private void daemonThread() {
        while (true) {
            synchronized (this) {
                if (possibleTokensFilled < MAXTOKEN) {
                    possibleTokensFilled++;
                    System.out.println("Daemon Thread : " + Thread.currentThread().getName() + "tokens available " + possibleTokensFilled);
                }
                this.notify();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

    synchronized void getTokens() throws InterruptedException {
        if (possibleTokensFilled == 0L) {
            this.wait();
            System.out.println("Thread:" + Thread.currentThread().getName() + "  waiting ..");
        }
        possibleTokensFilled--;
        System.out.println("Thread:" + Thread.currentThread().getName() + "   tokens after fetch " + possibleTokensFilled);
    }
}
