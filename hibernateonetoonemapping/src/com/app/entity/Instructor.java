package com.app.entity;

import org.hibernate.annotations.JoinColumnOrFormula;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	
	  @JoinColumn()
	@OneToOne(mappedBy = "instructiondetails",cascade = CascadeType.ALL)
	// for one to one mapping unidirectional

	// for one to one mapping  bidirectional
	
	private InstructorDetails instructordetails;
	public Instructor(String firstName, String lastName, String email, InstructorDetails instructordetails) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.instructordetails = instructordetails;
	}
	
	
}
