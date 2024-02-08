package com.praticeQuestion.streamAPI;

import java.util.List;

public class AverageOfNumber {
    public static void main(String[] args) {
        List <Integer> list = List.of(2,6,23,8,10,54,18);
       int average =(int) list.stream().mapToInt(e ->e).average().getAsDouble();
        System.out.println(average);
    }
}
