package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    
    @Column
    private String email;

    // many-to-many mapping

    
    // joining the table
    @ManyToMany(
        fetch = FetchType.EAGER,
        cascade = CascadeType.PERSIST
    )

    @JoinTable(
        name = "student_course",

        joinColumns = @JoinColumn(name = "student_id"),

        inverseJoinColumns = @JoinColumn(name = "course_id")
    )

    private Set<Course> courses = new HashSet<>();


    // default constructor
    public Student()
    {

    }

    public Student(String firstname,
                   String lastname,
                   String email)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Set<Course> getCourses()
    {
        return courses;
    }

    public void setCourses(Set<Course> courses)
    {
        this.courses = courses;
    }

    @Override
    public String toString()
    {
        return "Student [id=" + id +
                ", firstname=" + firstname +
                ", lastname=" + lastname +
                ", email=" + email + "]";
    }

    // helper method
    public void add(Course tempCourse)
    {
        courses.add(tempCourse);

        tempCourse.getStudents().add(this);
    }
}