package com.bko.BehaviorPatterns.Iterator.study3;

import com.bko.BehaviorPatterns.Iterator.samples.MyClass;
import com.bko.BehaviorPatterns.Iterator.samples.Student;
import com.bko.BehaviorPatterns.Iterator.samples.Teacher;
import com.bko.BehaviorPatterns.Iterator.study2.Iterator;

/**
 * Created by yo on 4/2/15.
 */

public class VeteranTeacher extends Teacher {
    private MyNewStudentList list;

    @Override
    public void createStudentList() {
        list = new MyNewStudentList();
        String[] nameList = MyClass.getStudentsNameList();
        int[] sexList = MyClass.getStudentSexList();

        for(int i=0; i < nameList.length; i++){
            list.add(new Student( nameList[i], sexList[i]) );
        }
    }

    @Override
    public void callStudents() {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println( ( (Student)itr.next() ).getName() );
        }
    }
}
