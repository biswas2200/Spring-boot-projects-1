package com.praticeQuestion.streamAPI;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,7,10,1,0,6,14,2);
        //In ascending order.
        List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
        //In descending order.
        List<Integer> newlist1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println("Ascending Order :\n"+newList +"\nDescending Order : \n"+newlist1);
    }
}
