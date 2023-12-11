package com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static University university=new University();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student("Le Hong Anh",19,3.1);
        Course course=new Course("HDT", Arrays.asList(student));
        int choice;
        do {
            System.out.println("1. Display Students");
            System.out.println("2. Display Courses");
            System.out.println("3. Add Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Add Course");
            System.out.println("6. Remove Course");
            System.out.println("7. Enroll Student in Course");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if(choice == 1) university.getStudent();
            if(choice == 2) university.getCourse();
            if(choice == 3) university.addStudent(student);
            if(choice == 4) university.removeStudent(1);
            if(choice == 5) university.addCourse(course);
            if(choice == 6) university.removeCourse(1);
            if(choice == 7) enrollStudentInCouseI(university);
        } while (choice != 0);
    }

    private static void enrollStudentInCouseI(University university) {

    }
}
