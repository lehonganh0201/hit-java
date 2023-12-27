package com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String studentName;
    private int studentId;
    private double grade;

    public Student(String studentName, int studentId, double grade) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [Name: " + studentName + ", ID: " + studentId + ", Grade: " + grade + "]";
    }
}
