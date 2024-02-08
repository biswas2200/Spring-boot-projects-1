package com.praticeQuestion.streamAPI.mapVsFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

//Hard-coding data.
public class MainApp {
    public static void main(String[] args) {
        List <String> citiesWorkedUpon = new ArrayList<>();
        citiesWorkedUpon.add("Pune");
        citiesWorkedUpon.add("Bangalore");
        citiesWorkedUpon.add("Delhi");
        Employee employee1 = new Employee(1,"Pandey",citiesWorkedUpon);
      //  System.out.println(employee1);

        List <String> citiesWorkedUpon1 = new ArrayList<>();
        citiesWorkedUpon1.add("Noida");
        citiesWorkedUpon1.add("Bangalore");
        citiesWorkedUpon1.add("Delhi");
        citiesWorkedUpon1.add("Chennai");
        Employee employee2 = new Employee(2,"Rohit",citiesWorkedUpon1);
        //System.out.println(employee2);

        List <String> citiesWorkedUpon2 = new ArrayList<>();
        citiesWorkedUpon2.add("Uttar Pradesh");
        citiesWorkedUpon2.add("Bangalore");
        citiesWorkedUpon2.add("Delhi");
        Employee employee3 = new Employee(3,"Mohit",citiesWorkedUpon2);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        System.out.println(employeeList);

        //Using map can reduce the line of code or else we have to use loops to get employees IDs
       String employeesID = employeeList.stream().map(emp -> emp.getId()).collect(Collectors.toList()).toString();
        System.out.println(employeesID);

        List<String> employeesNames = employeeList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(employeesNames);

        Set<String> set1 = employeeList.stream().flatMap(emp -> emp.getCitiesWorkedUpon().stream()).collect(Collectors.toSet());
        System.out.println(set1);

    }
}
