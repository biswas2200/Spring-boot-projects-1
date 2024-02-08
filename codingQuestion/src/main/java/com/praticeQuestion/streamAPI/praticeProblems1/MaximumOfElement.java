package com.praticeQuestion.streamAPI.praticeProblems1;


import java.util.Arrays;
import java.util.List;

public class MaximumOfElement {
    public static void main(String[] args) {
        //Maximum of element.
        List<Integer> list = Arrays.asList(23,56,12,7,25,75,13,54,60);
        int maximum = list.stream().max((x,y)-> x.compareTo(y)).get();
        int minimum = list.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
