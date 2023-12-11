package com;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Displayable{
    private int age;
    private double grade;
    private List<Course> list=new ArrayList<>();

    public Student(String name, int age, double grade) {
        super(name);
        this.age = age;
        this.grade = grade;
    }

    public Student(int age, double grade) {
        this.age = age;
        this.grade = grade;
    }

    public Student(String name) {
        super(name);
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void enroll(Course course){
        list.add(course);
        course.getList().add(new Student(name,age,grade));
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println("COURSE OF " + "'" + name + "' is: " + list.size() );
        for(Course x : list){
            System.out.printf("%-15d %-55s\n" , x.getCourseId() , x.getCourseName());
        }
    }
}