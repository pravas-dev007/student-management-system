package com.pravas.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravas.studentmanagement.entity.Student;
import com.pravas.studentmanagement.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;
	
	// Save
    @PostMapping
    public Student save(@Valid @RequestBody Student s) {
        return service.saveStudent(s);
    }

    // Get all
    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    // Get by ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student s) {
        return service.updateStudent(id, s);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}
