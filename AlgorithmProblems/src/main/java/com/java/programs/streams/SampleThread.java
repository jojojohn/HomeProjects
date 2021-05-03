package com.java.programs.streams;

public class SampleThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=150; i++) {
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 151; i < 500; i++) {
                    System.out.println(i);
                }
            }
        });

        t1.start();
        t2.start();

      //  t1.join();
        t2.join();
        System.out.println("Complete.");
    }


}
