package com.bko.behavior_patterns.iterator.study2;


import com.bko.behavior_patterns.iterator.samples.StudentList;

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
