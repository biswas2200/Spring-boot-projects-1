package com.studentTask.Task1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentMarksDto {
    private String studentSubject;
    private int studentMarks;
}
