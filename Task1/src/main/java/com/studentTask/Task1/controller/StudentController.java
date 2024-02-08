package com.studentTask.Task1.controller;


import com.studentTask.Task1.dao.StudentMarksRepository;
import com.studentTask.Task1.dao.StudentRepository;
import com.studentTask.Task1.dto.StudentDto;
import com.studentTask.Task1.model.Student;
import com.studentTask.Task1.model.StudentMarks;
import com.studentTask.Task1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getStudents")
    public List<StudentDto> getAllStudentDetails(){
       return studentService.getAllStudents();
    }
    @GetMapping("/getStudents/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/createStudents")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.CREATED);
    }
    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudentById(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
    @DeleteMapping("/deleteStudent")
    public void deleteStudents(){
        studentService.deleteStudentAll();
    }

}
