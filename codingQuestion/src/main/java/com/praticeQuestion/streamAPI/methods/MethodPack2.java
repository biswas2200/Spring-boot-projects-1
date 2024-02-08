package com.praticeQuestion.streamAPI.methods;
//summing() , averagingInt(), summarizing()

import java.util.List;
import java.util.stream.Collectors;

/* Three ver of summing : 1) summingInt 2) summingDouble 3) summingLong ~ same as averaging has 3.
*/
public class MethodPack2 {
    public static void main(String[] args) {
        List<String> playerNames = List.of("Aiyat","Mansoor","Ajbi");
        List<Integer> playerScore = List.of(12,20,25,18,30,10,16,35);
        List<Double> playerScoreDouble = List.of(12.8,20.9,25.12,18.84,30.25,10.01,16.81,35.86);

        Integer overallDamage = playerScoreDouble.stream().mapToInt(Double::intValue).sum();
        System.out.println(overallDamage);

        Double overallDamageDouble = playerScoreDouble.stream().collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println(overallDamageDouble);
//Bakwass methods.

    }
}
