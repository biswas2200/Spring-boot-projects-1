package com.praticeQuestion.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,1,1,3,4,22,2,22,9,11,21,23,3,4,4,11);
        Set<Integer> newSet = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
        System.out.println(newSet);

    }
}
