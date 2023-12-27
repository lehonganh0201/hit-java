package com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private static final String STUDENTS_FILE = "students.txt";
    private static final String GRADES_FILE = "grades.txt";

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STUDENTS_FILE))) {
            students = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Student newStudent = new Student("John Doe", 123, 8.5);

        if (newStudent.getGrade() >= 0 && newStudent.getGrade() <= 10) {
            students.add(newStudent);
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 10.");
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(STUDENTS_FILE))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(GRADES_FILE, true))) {
            writer.println(newStudent.getStudentId() + " " + newStudent.getGrade());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}