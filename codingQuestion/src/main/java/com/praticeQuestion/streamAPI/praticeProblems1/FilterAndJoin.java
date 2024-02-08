package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndJoin {
    public static void main(String[] args) {
        List<String> startsWithA = Arrays.asList("apple","adam","lion","eve","child","atta","Roti","ashish","Raita");
        String finalList = startsWithA.stream().filter(e -> !e.contains("a")).collect(Collectors.joining(", "));
        System.out.println(finalList);
    }
}
