package com.praticeQuestion.streamAPI;

import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,0,98,8,7,6,12,34,89);
       Optional<Integer> sum = list.stream().reduce((a, b) -> a+b);
        System.out.println(sum.get());
    }
}
