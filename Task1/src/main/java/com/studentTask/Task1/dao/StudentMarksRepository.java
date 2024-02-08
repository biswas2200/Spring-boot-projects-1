package com.studentTask.Task1.dao;

import com.studentTask.Task1.model.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMarksRepository extends JpaRepository<StudentMarks, Long> {
}
