package com;

import java.util.ArrayList;
import java.util.List;

public class Course implements Displayable{
    private int courseId=n;
    private String courseName;
    List<Student> list=new ArrayList<>();

    private static int n = 1;

    public Course() {
        n++;
    }

    public Course(String courseName, List<Student> list) {
        this.courseName = courseName;
        this.list = list;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public void displayInfo() {
        for(Student x : list){
            System.out.printf("%-15s %-32s %-15d %-15s\n" , x.getId() , x.getName() , x.getAge() , x.getGrade() );
        }
    }
}
