package com.final_PraticeUdemy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HabitablePlanet {
    private static final String SOLID = "solid";
    private static final int AVERAGE_EARTH_TEMPRATURE = 16;
    private static final double EARTH_SUN_DISTANCE = 0.00001581;

    public static void main(String[] args) {
        ArrayList<Planet> planets = new ArrayList<>();
        planets.addAll(PlanetsData.getPlanets());

        System.out.println("Total number of planets : "+planets.stream().distinct().count());
        Optional<Planet> biggestPlanet = planets.stream().max(Comparator.comparing(Planet::getSize));
        System.out.println("Biggest Planet "+biggestPlanet.get().getName()+" with size "+biggestPlanet
                .get().getSize()+"km");

        Optional<Planet> coldestPlanet = planets.stream().min(Comparator.comparing(Planet::getTemperature));
        System.out.println("The coldest planet is "+coldestPlanet.get().getName()+" with temperature : "+coldestPlanet.get().getTemperature()+"C");

        Optional<Planet> hottestPlanet = planets.stream().max(Comparator.comparing(Planet::getTemperature));
        System.out.println("Hottest planet "+hottestPlanet.get().getName()+" with temperature : "+hottestPlanet.get().getTemperature());

        System.out.println("Top 10 habitual planets are : ");
        planets.stream().filter(planet -> SOLID.equals(planet.getType())).sorted(Comparator.comparing((Planet p) -> Math.abs(p.getTemperature() - AVERAGE_EARTH_TEMPRATURE))
                .thenComparing(Planet::getDistanceFromEarth)).limit(10).forEach(System.out::println);

        System.out.println("Planet with closest distance star, as EARTH and SUN");
        Planet closestDistance = planets.stream().min(Comparator.comparing(p -> Math.abs(p.getClosestStarDistance()-EARTH_SUN_DISTANCE))).get();
        System.out.println(closestDistance);

    }
}
