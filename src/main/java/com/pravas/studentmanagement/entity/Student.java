package com.pravas.studentmanagement.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="student_info")
public class Student {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="student_id")
	 private int id;

	 @NotBlank
	 private String name;

	 @Min(18)
	 @Max(50)
	 private int age;

	 @NotBlank
	 @Email
	 private String email;

	 @NotBlank
	 private String course;

	 @Positive
	 private double fees;
	 
	 @NotBlank
	 @Pattern(regexp = "Active|Inactive", message = "Status must be Active or Inactive")
	 private String status;
}
