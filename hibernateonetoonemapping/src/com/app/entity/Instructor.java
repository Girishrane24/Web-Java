package com.app.entity;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
//	@Generated(strategy = GenerationType.IDENTITY)
	@Generated
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Instructor_detail_id")
	private InstructorDetails instructordetails;
}
