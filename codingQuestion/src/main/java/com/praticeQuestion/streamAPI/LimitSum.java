package com.praticeQuestion.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class LimitSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,10,5,6,15,20,21,18,32);
        //get sum of first -5 numbers.

        List <Integer> limitList = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limitList);
        int sumList = limitList.stream().reduce((p,q) -> p+q).get();
        System.out.println(sumList);

        //get-skip after 5 numbers and sum all.
        List <Integer> skipList = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(skipList);
        int skipSum = list.stream().reduce((p,q) -> p+q).get();
        System.out.println(skipSum);
    }
}
