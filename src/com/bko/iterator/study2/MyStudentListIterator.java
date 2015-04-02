package com.bko.iterator.study2;

import com.bko.iterator.samples.Student;

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
        if(myStudentList.getLastNum() > index) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Student next() {//ダウンキャストならOK?
        Student s = myStudentList.getStudentAt(index);
        index++;
        return s;
    }
}
