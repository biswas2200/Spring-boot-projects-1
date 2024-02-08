package com.studentTask.Task1.service;

import com.studentTask.Task1.dto.StudentDto;
import com.studentTask.Task1.model.Student;

import java.util.List;

public interface StudentService {
    public List<StudentDto> getAllStudents ();
    public Student getStudentById (Long id);
    public Student createStudent (Student student);
    public Student updateStudent (Long id, Student student);
    public void deleteStudent(Long id);
    public void deleteStudentAll();
}
