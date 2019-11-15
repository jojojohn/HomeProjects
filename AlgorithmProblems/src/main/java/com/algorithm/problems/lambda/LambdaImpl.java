package com.algorithm.problems.lambda;

public class LambdaImpl {

    public static  void joinString(final String a, final String b) {
        System.out.println(b + "," + a);
    }
    public static void main(String [] args) {
        SampleInterface sampleInterface = (first, second) -> {
            String name  = first + " " + second;
            System.out.println(name);
        };

        sampleInterface.printSample("jojo", "john");
        SampleInterface sampleInterface1 = LambdaImpl::joinString;
        sampleInterface1.printSample("jojo", "john");
    }
}
