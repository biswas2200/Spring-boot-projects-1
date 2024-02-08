package com.praticeQuestion.streamAPI.student_info;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentINFO_App {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Mohit", 21, Gender.Male, Department.MTECH_ComputerScience, "Nagpur", 10, Arrays.asList("+918234454322,+919823697651")),
                        new Student(2, "Ravi", 20, Gender.Male, Department.MCA, "Agra", 12, Arrays.asList("+918234454300,+919823697611")),
                        new Student(3, "Jenna", 21, Gender.Female, Department.MSC_ComputerScience, "Bangalore", 103, Arrays.asList("+918234454387,+919823697650")),
                        new Student(4, "Rani", 22, Gender.Female, Department.MCA, "Kolkata", 76, Arrays.asList("+918234454388,+919823697620")),
                        new Student(5, "Rohit", 19, Gender.Male, Department.MCA, "Hyderabad", 100, Arrays.asList("+918234454355,+919823697699")),
                        new Student(6, "Isha", 20, Gender.Female, Department.MBA, "Nagpur", 94, Arrays.asList("+919234454387,+917823697653")),
                        new Student(7, "Sahil", 22, Gender.Male, Department.MSC_ComputerScience, "Nagpur", 88, Arrays.asList("+918244454387,+919723697653")),
                        new Student(8, "Munni", 20, Gender.Female, Department.MTECH_ComputerScience, "Nagpur", 105, Arrays.asList("+918934454387,+919023697653")),
                        new Student(9, "Prema", 21, Gender.Female, Department.MSC_ComputerScience, "Nagpur", 111, Arrays.asList("+918237454387,+919823297653")),
                        new Student(10, "Janvi", 20, Gender.Female, Department.MTECH_ComputerScience, "Nagpur", 107, Arrays.asList("+918239454387,+919103697653")),
                        new Student(10, "Ruflo", 23, Gender.non_Binary, Department.MBA, "Delhi", 114, Arrays.asList("+918233454387,+919823697653")))
                .collect(Collectors.toList());

        //Find the list of students whose rank is between 50 and 100?
        List<Student> studentCollectRank = studentList.stream()
                .filter(student -> (student.getRank() > 49) && (student.getRank() < 101)).toList();
        System.out.println(studentCollectRank);

        //Find the students who stay in Nagpur and sort them by their names?
        studentList.stream()
                .filter(student -> student.getCity().equals("Nagpur"))
                .sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);

        //Find all the departments list?
        List<Department> allDepartments = studentList.stream()
                .map(Student::getDepartment)
                .distinct().collect(Collectors.toList());
        System.out.println(allDepartments);

        //Find all the contacts number.

    }
}
