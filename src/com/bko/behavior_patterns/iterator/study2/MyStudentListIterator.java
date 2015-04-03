package com.bko.behavior_patterns.iterator.study2;

import com.bko.behavior_patterns.iterator.samples.Student;

/**
 * Created by yo on 4/2/15.
 */
public class MyStudentListIterator implements Iterator {
    private MyStudentList myStudentList;
    private int index;

    public MyStudentListIterator(MyStudentList list) {
        this.myStudentList = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return myStudentList.getLastNum() > index;
    }

    @Override
    public Student next() {//ダウンキャストならOK?
        Student s = myStudentList.getStudentAt(index);
        index++;
        return s;
    }
}
