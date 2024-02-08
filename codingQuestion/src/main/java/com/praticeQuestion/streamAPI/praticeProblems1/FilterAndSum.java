package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSum {
    public static void main(String[] args) {
        List<Integer> num1 = List.of(1,2,3,4,5,6,7,8,9);
        List <Integer> result = filterAndSum(num1);
        System.out.println(result);
    }
    public static List<Integer> filterAndSum(List<Integer> num){
        return num.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
    }
}
