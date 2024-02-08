package com.praticeQuestion.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class NumberSquare {
    public static void main(String[] args) {
        List <Integer> list = List.of(1,5,60,100,00,12);
        List <Integer> newList = list.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> list1 = newList.stream().filter(e -> e>100).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("---------------------------------");
        double dblAvg = list.stream().map(e -> e*e).filter(e -> e>100).mapToInt(e ->e).average().getAsDouble();
        System.out.println(dblAvg);
    }
}
