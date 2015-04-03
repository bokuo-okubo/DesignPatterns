package com.bko.Iterator.study2;

import com.bko.Iterator.samples.StudentList;

/**
 * Created by bko on 4/2/15.
 */


public class MyStudentList extends StudentList implements Aggregate {
    public MyStudentList() {
        super();
    }

    public MyStudentList(int studentCount) {
        super(studentCount);
    }

    @Override
    public Iterator iterator() {
        return new MyStudentListIterator(this);
    }
}
