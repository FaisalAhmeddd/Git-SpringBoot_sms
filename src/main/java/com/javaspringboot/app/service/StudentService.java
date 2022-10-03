package com.javaspringboot.app.service;

import java.util.List;
import java.util.Optional;

import com.javaspringboot.app.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student getStudentById(Long id);
	public Student editStudent(Student student);
	public void deleteStudentById(Long id);
	

}
