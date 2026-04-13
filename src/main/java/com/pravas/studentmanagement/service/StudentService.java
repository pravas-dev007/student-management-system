package com.pravas.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravas.studentmanagement.dto.StudentDTO;
import com.pravas.studentmanagement.entity.Student;
import com.pravas.studentmanagement.exception.DuplicateResourceException;
import com.pravas.studentmanagement.exception.StudentNotFoundException;
import com.pravas.studentmanagement.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // CREATE
    public Student saveStudent(StudentDTO dto) {

        // duplicate email check
        if (repo.findByEmail(dto.getEmail()).isPresent()) {
            throw new DuplicateResourceException("Email already exists");
        }

        Student student = mapToEntity(dto);
        return repo.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // COMMON METHOD (reuse everywhere)
    private Student findStudentById(int id) {
        return repo.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    // READ BY ID
    public Student getStudentById(int id) {
        return findStudentById(id);
    }

    // UPDATE (using DTO)
    public Student updateStudent(int id, StudentDTO dto) {

        Student existing = findStudentById(id);

        // check if email is changing
        if (!existing.getEmail().equals(dto.getEmail()) &&
                repo.findByEmail(dto.getEmail()).isPresent()) {
            throw new DuplicateResourceException("Email already exists");
        }

        existing.setName(dto.getName());
        existing.setAge(dto.getAge());
        existing.setEmail(dto.getEmail());
        existing.setCourse(dto.getCourse());
        existing.setFees(dto.getFees());
        existing.setStatus(dto.getStatus());

        return repo.save(existing);
    }

    // DELETE
    public void deleteStudent(int id) {
        Student student = findStudentById(id);
        repo.delete(student);
    }

    // MAPPING METHOD
    private Student mapToEntity(StudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setAge(dto.getAge());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        student.setFees(dto.getFees());
        student.setStatus(dto.getStatus());
        return student;
    }
}