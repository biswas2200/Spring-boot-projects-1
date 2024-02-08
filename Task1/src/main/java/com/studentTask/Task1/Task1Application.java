package com.studentTask.Task1;

import com.studentTask.Task1.dao.StudentMarksRepository;
import com.studentTask.Task1.dao.StudentRepository;
import com.studentTask.Task1.model.Student;
import com.studentTask.Task1.model.StudentMarks;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		SpringApplication.run(Task1Application.class, args);
	}

}
