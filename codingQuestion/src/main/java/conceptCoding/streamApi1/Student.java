package conceptCoding.streamApi1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private List<Integer> marks;
    private Map<Integer,String> department;

    public Student(int id, String firstName, List<Integer> marks, Map<Integer, String> department) {
        this.id = id;
        this.firstName = firstName;
        this.marks = marks;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Map<Integer, String> getDepartment() {
        return department;
    }

    public void setDepartment(Map<Integer, String> department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(firstName, student.firstName) && Objects.equals(marks, student.marks) && Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, marks, department);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", marks=" + marks +
                ", department=" + department +
                '}';
    }
}
