package com.bko.BehaviorPatterns.Iterator.study3;

import com.bko.BehaviorPatterns.Iterator.samples.Student;
import com.bko.BehaviorPatterns.Iterator.study2.Aggregate;
import com.bko.BehaviorPatterns.Iterator.study2.Iterator;

/**
 * Created by yo on 4/2/15.
 */
public class MyNewStudentList extends NewStudentList implements Aggregate {
    @Override
    public void add(Student student) {
        super.add(student);
    }

    @Override
    public Student getStudentAt(int index) {
        return super.getStudentAt(index);
    }

    @Override
    public Iterator iterator() {
        return new MyNewStudentListIterator(this);
    }

}
