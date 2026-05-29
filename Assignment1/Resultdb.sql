CREATE DATABASE Resultdb;

show databases;

USE Resultdb;

CREATE TABLE Student(
    PRN VARCHAR(20),
    StudentName VARCHAR(50),
    Subject1 DOUBLE,
    Subject2 DOUBLE,
    Subject3 DOUBLE,
    Subject4 DOUBLE,
    Subject5 DOUBLE,
    Total DOUBLE,
    Percentage DOUBLE,
    Statusval VARCHAR(10)
);

drop table Student;
select * from Student;