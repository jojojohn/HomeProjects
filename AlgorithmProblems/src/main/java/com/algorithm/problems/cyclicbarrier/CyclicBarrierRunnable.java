package com.algorithm.problems.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunnable implements Runnable{

    CyclicBarrier cyclicBarrier_1 = null;
    CyclicBarrier cyclicBarrier_2 = null;

    public CyclicBarrierRunnable(final CyclicBarrier cyclicBarrier_1, final CyclicBarrier cyclicBarrier_2) {
        this.cyclicBarrier_1 = cyclicBarrier_1;
        this.cyclicBarrier_2 = cyclicBarrier_2;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 1");
            this.cyclicBarrier_1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 2");
            this.cyclicBarrier_2.await();
            System.out.println(Thread.currentThread().getName() +
                    " done!");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
