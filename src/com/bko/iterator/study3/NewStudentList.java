package com.bko.Iterator.study3;

/**
 * Created by yo on 4/2/15.
 */
import java.util.Vector;

import com.bko.Iterator.samples.Student;

public class NewStudentList {
    protected Vector<Student> students = new Vector<Student>();

    public void add(Student student) {
        students.add(student);
    }

    public Student getStudentAt(int index) {
        return  students.get(index);
    }

}
