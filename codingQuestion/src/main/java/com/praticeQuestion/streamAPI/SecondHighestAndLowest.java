package com.praticeQuestion.streamAPI;

import java.util.Collections;
import java.util.List;

public class SecondHighestAndLowest {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,3,42,2,1,0,2,8,32,10,11,19,10,3,12,14,0);
        //Second-Highest number.
        int secondHighest = number.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondHighest);
        //Second-Lowest number.
        int secondLowest = number.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secondLowest);

    }
}
