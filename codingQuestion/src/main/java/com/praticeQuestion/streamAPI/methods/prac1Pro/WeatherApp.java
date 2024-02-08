package com.praticeQuestion.streamAPI.methods.prac1Pro;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class WeatherApp{
    public static void main(String[] args) {
        //Weather report of my Desire country.
        List<WeatherByMonth> weather = List.of(
                new WeatherByMonth("January",20,16),
                new WeatherByMonth("Feburary",20,17),
                new WeatherByMonth("March",25,21),
                new WeatherByMonth("April",25,23),
                new WeatherByMonth("May",25,23),
                new WeatherByMonth("June",26,23),
                new WeatherByMonth("July",26,24),
                new WeatherByMonth("August",25,23),
                new WeatherByMonth("September",25,23),
                new WeatherByMonth("October",23,22),
                new WeatherByMonth("November",20,16),
                new WeatherByMonth("December",15,-5)
                );
        WeatherByMonth maxDayTimeWeather = weather.stream().collect(Collectors.maxBy(Comparator.comparing(WeatherByMonth :: getTempratureAtDay))).get();
        System.out.println("Hottest : "+ maxDayTimeWeather);

       // weather.stream()
    }
}