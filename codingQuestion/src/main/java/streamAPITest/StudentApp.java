package streamAPITest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(101, "John", 400, Map.of(1000, "MBA")),
                new Student(102, "Mary", 300, Map.of(1001, "BBA")),
                new Student(103, "Priya", 420, Map.of(1001, "BBA")),
                new Student(104, "Nina", 401, Map.of(1000, "MBA")),
                new Student(105, "Jonathan", 103, Map.of(1000, "MBA")),
                new Student(106, "Rohit", 347, Map.of(1002, "B.com")),
                new Student(107, "Vijay", 260, Map.of(1002, "B.com")),
                new Student(108, "Jai", 386, Map.of(1001, "BBA")),
                new Student(109, "Prakash", 486, Map.of(1001, "BBA")),
                new Student(110, "Ben", 249, Map.of(1000, "MBA")),
                new Student(112, "Omar", 238, Map.of(1002, "B.com")),
                new Student(113, "Usma", 289, Map.of(1001, "BBA")),
                new Student(114, "Priti", 211, Map.of(1002, "B.com"))
        ).toList();

        studentList.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);

        for (Map.Entry<Map<Integer, String>, List<String>> objectListEntry : studentList.stream().collect(Collectors.
                groupingBy(Student::getDepartment, Collectors
                        .mapping(Student::getFirstName, Collectors.toList()))).entrySet().stream().collect(Collectors.toSet())) {
            System.out.println(objectListEntry);

        }


      //  System.out.println(collect);

    }
}
