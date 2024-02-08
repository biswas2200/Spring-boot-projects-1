package com.praticeQuestion.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Start with prefix 2 -> so, first have to converts Integer array to (Important)String Array.
//for filter and then again to Integer
public class NumberStartsWithPrefix {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(102,210,328,193,286,285,211);
        List <Integer> newList = list.stream().map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(newList);
    }
}
