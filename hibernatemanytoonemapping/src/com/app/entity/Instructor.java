package com.app.entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity

public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "instruction_id")

	private List<Courses> course;

	public Instructor(String firstName, String lastName, String email, List<Courses> course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.course = course;
	}

	public void add(Courses tempCourse) {
		
		if(course == null)
		{
			course = new ArrayList<>();
		}
		course.add(tempCourse);
		tempCourse.setInstructor(this);
	}
	
	


	
	}