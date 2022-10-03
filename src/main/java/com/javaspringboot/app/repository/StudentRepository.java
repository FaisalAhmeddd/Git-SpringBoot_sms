package com.javaspringboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.app.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
