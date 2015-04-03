package com.bko.behavior_patterns.iterator.study3;

import com.bko.behavior_patterns.iterator.samples.Student;
import com.bko.behavior_patterns.iterator.study2.Iterator;

/**
 * Created by yo on 4/2/15.
 */
public class MyNewStudentListIterator implements Iterator {
    private MyNewStudentList myNewStudentList;
    private int index;

    public MyNewStudentListIterator(MyNewStudentList list) {
        this.myNewStudentList = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return myNewStudentList.students.size() > index;
    }

    @Override
    public Object next() {
        Student s = myNewStudentList.getStudentAt(index);
        index++;
        return s;
    }
}
