package com.bko.BehaviorPatterns.Iterator.study3;

import com.bko.BehaviorPatterns.Iterator.samples.Student;
import com.bko.BehaviorPatterns.Iterator.study2.Iterator;

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
        if(myNewStudentList.students.size() > index){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Student s = myNewStudentList.getStudentAt(index);
        index++;
        return s;
    }
}
