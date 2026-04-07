package com.pravas.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravas.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
