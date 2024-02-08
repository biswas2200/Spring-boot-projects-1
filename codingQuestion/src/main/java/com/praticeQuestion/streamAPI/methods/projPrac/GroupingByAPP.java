package com.praticeQuestion.streamAPI.methods.projPrac;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByAPP {
    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
                new Item ("StrawBerry",10,400),
                new Item ("StrawBerry",20,800),
                new Item ("Apple",10,205),
                new Item ("Mango",10,200),
                new Item ("Mango",9,180),
                new Item ("Grapes",10,700),
                new Item ("Orange",10,250),
                new Item ("Pears",2,90),
                new Item ("WaterMelon",4,150),
                new Item ("Pears",4,180),
                new Item ("Mango",6,150),
                new Item ("Kiwi",8,80),
                new Item ("Kiwi",12,120),
                new Item ("Kiwi",5,50),
                new Item ("Kiwi",22,220)
        );

       Map<Boolean,List<Item>> partioningFruitBoxes = fruitBoxes.stream()
               .collect(Collectors.partitioningBy(fruitBox -> fruitBox.getPrice()>150));
        System.out.println(partioningFruitBoxes);

       Map <String, List<Item>> fruitBoxesGroup = fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item :: getName));

        System.out.println(fruitBoxesGroup);

       Map<String, Long> fruitBoxesCount =  fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
        System.out.println(fruitBoxesCount);

        Map<String, Long> fruitBoxesCountOrdered = new LinkedHashMap<>();
                fruitBoxesCount.entrySet().stream().sorted(Map.Entry
                .comparingByKey()).forEach(fruitBox -> fruitBoxesCountOrdered
                        .put(fruitBox.getKey(), fruitBox.getValue()));

        System.out.println(fruitBoxesCountOrdered);

    }
}
