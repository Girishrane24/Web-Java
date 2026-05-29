

create database course_registration_system;
use course_registration_system;

create table student(
	id INT PRIMARY KEY AUTO_INCREMENT,
    fullname VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);

select * from student;

CREATE TABLE course(
    cid INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100),
    duration VARCHAR(50)
);
select * from course;