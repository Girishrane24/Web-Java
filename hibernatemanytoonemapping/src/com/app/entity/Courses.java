package com.app.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="instructor_id")
	private Instructor instructor;

	
	// create parameterized constructor
	public Courses(String title) {
		this.title = title;
	}


	public Courses(String title, Instructor instructor) {
		super();
		this.title = title;
		this.instructor = instructor;
	}
	
}
