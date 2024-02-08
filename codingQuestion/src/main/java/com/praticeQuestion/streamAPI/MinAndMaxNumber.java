package com.praticeQuestion.streamAPI;

import java.util.Comparator;
import java.util.List;

public class MinAndMaxNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,5,18,15,23,54,20,22,10,74);

        //Integer max = list.stream().max((a,b) -> a.compareTo(b)).get();
        //Integer min = list.stream().min((a,b) -> a.compareTo(b)).get();

        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("Minimum : "+min+"\n"+"Maximum : "+max);
    }
}
