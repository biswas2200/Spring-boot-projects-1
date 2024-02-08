package com.praticeQuestion.streamAPI.mapVsFlatMap;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<String> citiesWorkedUpon;

    public Employee(int id, String name, List<String> citiesWorkedUpon) {
        super();
        this.id = id;
        this.name = name;
        this.citiesWorkedUpon = citiesWorkedUpon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCitiesWorkedUpon() {
        return citiesWorkedUpon;
    }

    public void setCitiesWorkedUpon(List<String> citiesWorkedUpon) {
        this.citiesWorkedUpon = citiesWorkedUpon;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", citiesWorkedUpon=" + citiesWorkedUpon +
                '}';
    }
}
