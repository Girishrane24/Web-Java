package app.java.model;

import lombok.Data;

@Data
public class Student {

    private String prn;
    private String studentName;

    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;
    private double subject5;

    private double total;
    private double percentage;

    private String statusval;
}