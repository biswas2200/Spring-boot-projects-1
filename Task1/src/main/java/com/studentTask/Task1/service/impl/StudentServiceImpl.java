package com.studentTask.Task1.service.impl;


import com.studentTask.Task1.dao.StudentMarksRepository;
import com.studentTask.Task1.dao.StudentRepository;
import com.studentTask.Task1.dto.StudentDto;
import com.studentTask.Task1.model.Student;
import com.studentTask.Task1.model.StudentMarks;
import com.studentTask.Task1.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMarksRepository studentMarksRepository;

    @Override
    public List<StudentDto> getAllStudents() {
       return studentRepository.findAll()
               .stream()
               .map(this::convertEntity)
               .collect(Collectors.toList());
    }

    private StudentDto convertEntity(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentName(student.getStudentName());
        studentDto.setStudentId(student.getStudentId());
        studentDto.setStudentAge(student.getStudentAge());
        return studentDto;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"STUDENT "+id+" NOT_PRESENT"));
    }

    @Override
    public Student createStudent(Student student) {
        student = studentRepository.save(student);
        List<StudentMarks>  studentMarksList = new ArrayList<>();
        for(StudentMarks studentMarks: student.getStudentMarksList()){
            studentMarks.setStdId(student.getStudentId());
            studentMarksList.add(studentMarks);
        }
        if(!studentMarksList.isEmpty()){
            studentMarksRepository.saveAll(studentMarksList);
        }
        student.setStudentMarksList(studentMarksList);
        return student;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return studentRepository.findById(id)
                .map(student1 -> {
                    student1.setStudentName(student.getStudentName());
                    student1.setStudentId(student.getStudentId());
                    student1.setStudentAge(student.getStudentAge());
                   return studentRepository.save(student1);
                }).orElseThrow(() -> new NoSuchElementException("NO_SUCH_STUDENT"));
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void deleteStudentAll(){
        studentRepository.deleteAll();
    }
}
