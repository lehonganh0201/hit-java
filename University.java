package com;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentList;
    private List<Course> courseList;

    public University(List<Student> studentList, List<Course> courseList) {
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public University() {
        courseList=new ArrayList<>();
        studentList=new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void getStudent(){
        studentList.forEach(T->T.displayInfo());
    }

    public void getCourse(){
        courseList.forEach(T->T.displayInfo());
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void removeStudent(Integer id){
        studentList.removeIf(T->T.getId()==id);
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void removeCourse(Integer id){
        courseList.removeIf(T->T.getCourseId()==id);
    }

    @Override
    public String toString() {
        return "University{" +
                "studentList=" + studentList +
                ", courseList=" + courseList +
                '}';
    }
}
