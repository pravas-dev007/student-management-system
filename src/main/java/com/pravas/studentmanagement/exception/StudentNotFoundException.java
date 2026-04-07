package com.pravas.studentmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException{

	private int studentId;

    public StudentNotFoundException(int studentId) {
        super("Student not found with ID: " + studentId);
        this.studentId = studentId;
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public int getStudentId() {
        return studentId;
    }
}
