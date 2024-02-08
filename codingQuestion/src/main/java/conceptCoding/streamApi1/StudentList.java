package conceptCoding.streamApi1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StudentList {
    private static final int MARKS_IN_EVERY_SUBJECT = 500;

    public static void main(String[] args) {
        List <Student> students = Stream.of(
                new Student(101,"John",List.of(400,435,236), Map.of(1001,"BA")),
                new Student(102,"Harry",List.of(300,335,366), Map.of(1001,"BA")),
                new Student(103,"Johnathan",List.of(500,335,236), Map.of(1001,"BA")),
                new Student(104,"Priya",List.of(400,435,436), Map.of(1002,"BBA")),
                new Student(105,"Prakash",List.of(212,435,236), Map.of(1002,"BBA")),
                new Student(106,"Allen",List.of(410,405,206), Map.of(1002,"BBA")),
                new Student(107,"Jai",List.of(345,395,336), Map.of(1002,"BBA")),
                new Student(108,"Brain",List.of(457,335,348), Map.of(1001,"BA")),
                new Student(109,"Rohit",List.of(462,435,378), Map.of(1003,"B.COM")),
                new Student(110,"Adam",List.of(235,235,476), Map.of(1003,"B.COM")),
                new Student(111,"Omar",List.of(300,392,312), Map.of(1003,"B.COM")),
                new Student(112,"Usma",List.of(491,435,496), Map.of(1001,"BA")),
                new Student(113,"Peter",List.of(139,435,431), Map.of(1002,"BBA")),
                new Student(114,"Jane",List.of(230,435,500), Map.of(1001,"BA")),
                new Student(115,"Joseph",List.of(319,435,236), Map.of(1003,"B.COM")),
                new Student(116,"Ishita",List.of(473,377,376), Map.of(1003,"B.COM"))
        ).toList();
       // students.stream().sorted(Comparator.comparing(streamAPITest.Student::getMarks).reversed()).forEach(System.out::println);


    }
}
