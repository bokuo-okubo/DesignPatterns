package com.bko.behavior_patterns.iterator.samples;

public abstract class Teacher{
    protected StudentList studentList;

    public abstract void createStudentList();
    public abstract void callStudents();
}