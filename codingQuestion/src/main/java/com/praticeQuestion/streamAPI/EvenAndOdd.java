package com.praticeQuestion.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11,122,93,40,56,67,8,76,23,45);
        List<Integer> evenNumbers = list1.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
        List<Integer> oddNumbers = list1.stream().filter(e -> e%2 !=0).collect(Collectors.toList());
        System.out.println("EVEN Numbers : "+evenNumbers+"\n"+"ODD Numbers : "+oddNumbers);
    }
}
