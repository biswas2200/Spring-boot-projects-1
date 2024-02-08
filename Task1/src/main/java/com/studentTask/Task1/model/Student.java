package com.studentTask.Task1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_table")
public class    Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_age")
    private Integer studentAge;

    @OneToMany(targetEntity = StudentMarks.class , mappedBy = "student", fetch = FetchType.LAZY)
    private List<StudentMarks> studentMarksList;
}
