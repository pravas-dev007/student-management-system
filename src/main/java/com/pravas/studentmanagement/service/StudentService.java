package com.pravas.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravas.studentmanagement.entity.Student;
import com.pravas.studentmanagement.exception.StudentNotFoundException;
import com.pravas.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

	    @Autowired
	    private StudentRepository repo;

	    // Save student
	    public Student saveStudent(Student s) {
	        return repo.save(s);
	    }

	    // Get all students
	    public List<Student> getAllStudents() {
	        return repo.findAll();
	    }

	    // Get student by ID
	    public Student getStudentById(int id) {
	        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
	    }

	    // Update student
	    public Student updateStudent(int id, Student s) {
	        Student existing = repo.findById(id)
	                .orElseThrow(() -> new StudentNotFoundException(id));

	        existing.setName(s.getName());
	        existing.setAge(s.getAge());
	        existing.setEmail(s.getEmail());
	        existing.setCourse(s.getCourse());
	        existing.setFees(s.getFees());
	        existing.setStatus(s.getStatus());

	        return repo.save(existing);
	    }

	    // Delete student
	    public String deleteStudent(int id) {
	        Student s = repo.findById(id)
	                .orElseThrow(() -> new StudentNotFoundException(id));

	        repo.delete(s);
	        return "Student deleted successfully";
	    }
	}
