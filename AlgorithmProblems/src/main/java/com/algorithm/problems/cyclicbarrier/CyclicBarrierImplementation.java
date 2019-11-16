package com.algorithm.problems.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierImplementation {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier_1 = new CyclicBarrier(5, () -> {
            System.out.println("barrier 1 is executed");
        });

        CyclicBarrier cyclicBarrier_2 = new CyclicBarrier(5, () -> {
            System.out.println("barrier 2 is executed");
        });

        new Thread(new CyclicBarrierRunnable(cyclicBarrier_1, cyclicBarrier_2)).start();
        new Thread(new CyclicBarrierRunnable(cyclicBarrier_1, cyclicBarrier_2)).start();
        new Thread(new CyclicBarrierRunnable(cyclicBarrier_1, cyclicBarrier_2)).start();
        new Thread(new CyclicBarrierRunnable(cyclicBarrier_1, cyclicBarrier_2)).start();
        new Thread(new CyclicBarrierRunnable(cyclicBarrier_1, cyclicBarrier_2)).start();
    }
}
