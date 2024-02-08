package com.studentTask.Task1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student_marks_table")
public class StudentMarks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_marks_id")
    private Long studentMarksId;

    @Column(name = "student_subjects")
    private String studentSubjects;

    @Column(name = "student_marks")
    private Integer studentMarks;

    @Column(name="student_id")
    private Long stdId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", updatable = false,insertable = false)
    private Student student;
}
