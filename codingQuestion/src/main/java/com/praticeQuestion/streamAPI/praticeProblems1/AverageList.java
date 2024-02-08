package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.Arrays;
import java.util.List;

public class AverageList {
    public static void main(String[] args) {
        List<Integer> listCalc = Arrays.asList(2,3,4,7,8,1,12,45,6);
        double result = listCalc.stream().mapToDouble(x -> x).average().getAsDouble();
        System.out.println(result);
    }
}
