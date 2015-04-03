package com.bko.BehaviorPatterns.Iterator.samples;

public abstract class Teacher{
    protected StudentList studentList;

    public abstract void createStudentList();
    public abstract void callStudents();
}