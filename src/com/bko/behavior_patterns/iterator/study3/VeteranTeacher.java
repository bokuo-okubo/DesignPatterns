package com.bko.behavior_patterns.iterator.study3;


import com.bko.behavior_patterns.iterator.samples.MyClass;
import com.bko.behavior_patterns.iterator.samples.Student;
import com.bko.behavior_patterns.iterator.samples.Teacher;
import com.bko.behavior_patterns.iterator.study2.Iterator;

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
