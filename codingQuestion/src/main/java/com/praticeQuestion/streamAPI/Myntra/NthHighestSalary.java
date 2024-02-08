package com.praticeQuestion.streamAPI.Myntra;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//second-highest salary.
//Using java 1.8 stream :Requirement

public class NthHighestSalary {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("anil",10000);
        map.put("bhavana",30000);//op
        map.put("hardy",30000);//op
        map.put("manoj",30000);//op
        map.put("michael",11000);
        map.put("tom",15000);
        map.put("mohit",15000);
        map.put("ankit",20000);
        map.put("ankita",25000);
        map.put("vijay",35000);

        Map.Entry<String, Integer> nthHighestSalary = getNthHighestSalary(1, map);
        System.out.println(nthHighestSalary);

        Map.Entry<Integer, List<String>> nthHighestSalary2 = getNthHighestSalary2(1, map);
        System.out.println(nthHighestSalary2);

    }
    public static Map.Entry<String,Integer> getNthHighestSalary(int num, Map<String, Integer> map){
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList().get(num);
    }

    public static Map.Entry<Integer, List<String>> getNthHighestSalary2(int num, Map<String,Integer>map){
        return map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(num);


    }
}
