package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        System.out.println("===========Plain Stream==========");
        long start = 0;
        long end = 0;

        end = System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        System.out.println("Plain Stream : "+(end-start));

        System.out.println("\n===========Parallel Stream==========");

        long start1 = 0;
        long end1 = 0;
        end1 = System.currentTimeMillis();

        IntStream.range(1,100).parallel().forEach(System.out :: println);
        System.out.println("Parallel Stream : "+(end1-start1));
    }
}
