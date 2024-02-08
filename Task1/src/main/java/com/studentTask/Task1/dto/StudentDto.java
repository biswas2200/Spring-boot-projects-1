package com.studentTask.Task1.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long studentId;
    private String studentName;
    private Integer studentAge;
    private List<StudentMarksDto> studentMarksDtos;

}
