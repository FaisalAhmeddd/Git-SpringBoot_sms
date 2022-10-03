package com.javaspringboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaspringboot.app.model.Student;
import com.javaspringboot.app.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemsApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	

	public StudentManagementSystemsApplication(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Faisal", "Ahmad", "ahmadfaiz500@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Faiz", "Ahmed", "faiz500@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("FaisalFaiz", "Ahmad", "ahmadfaiz@gmail.com");
//		studentRepository.save(student3);
		
		
		
	}

}
