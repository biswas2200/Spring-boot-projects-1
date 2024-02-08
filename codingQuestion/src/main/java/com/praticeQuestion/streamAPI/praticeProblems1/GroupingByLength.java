package com.praticeQuestion.streamAPI.praticeProblems1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//length of the strings->if any strings has same length group them together.
public class GroupingByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        Map<Integer,List<String>> groupedList = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedList);
        groupedList.forEach((lenghts, strings)->
                System.out.println("Strings with length "+lenghts + " : "+strings));
    }
}
