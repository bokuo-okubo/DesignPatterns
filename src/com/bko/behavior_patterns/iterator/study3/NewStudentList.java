package com.bko.behavior_patterns.iterator.study3;

import com.bko.behavior_patterns.iterator.samples.Student;

import java.util.Vector;

/**
 * Created by yo on 4/2/15.
 */

public class NewStudentList {
    protected Vector<Student> students = new Vector<Student>();

    public void add(Student student) {
        students.add(student);
    }

    public Student getStudentAt(int index) {
        return  students.get(index);
    }

}
