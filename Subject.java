package com;

public class Subject {
    private String id;
    private String subjectName;
    private int subjectCount;
    private String timeStart;
    private String timeEnd;

    public Subject() {
    }

    public Subject(String id, String subjectName, int subjectCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.subjectCount = subjectCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public void setSubjectCount(int subjectCount) {
        this.subjectCount = subjectCount;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
}
