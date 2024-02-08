package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapandDistinct {
    public static void main(String[] args) {
        List<List<Integer>> arrayAsList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(3,4,5),
                Arrays.asList(6,7,8)
        );

       List<Integer> flatList = arrayAsList.stream().flatMap(List::stream)
               .distinct().collect(Collectors.toList());
        System.out.println(flatList);
    }
}
