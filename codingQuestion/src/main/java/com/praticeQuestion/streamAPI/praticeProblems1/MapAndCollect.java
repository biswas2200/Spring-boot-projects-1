package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("people","man","woman","keys","door","glass"));
        List<String > list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list1);
    }
}
