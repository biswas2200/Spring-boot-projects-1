package com.praticeQuestion.streamAPI.methods;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningAndCounting {
    public static void main(String[] args) {
        List<String> playerNames = List.of("Aiyat","Mansoor","Ajbi");
        List<Integer> playerScore = List.of(12,20,25,18,30,10,16,35);
        List<Double> playerScoreDouble = List.of(12.8,20.9,25.12,18.84,30.25,10.01,16.81,35.86);

        System.out.println("Players Names : " + String.join(", ",playerNames));
        System.out.println("Players Score : " +playerScore.stream().
                map(Object::toString).collect(Collectors.joining(", ")));

        Long numberOfHits = playerScore.stream().count();
        System.out.println(numberOfHits);


        Long numberOfHits11 = (long) playerScore.size();
        System.out.println(numberOfHits11);
    }
}
