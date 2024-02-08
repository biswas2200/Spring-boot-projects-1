package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,2,24,4,4,3,3,6,7,5,8,9,1,5,0,9,8,5,5,5,5);
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);
    }
}
