package com.bko.BehaviorPatterns.Iterator;

import com.bko.BehaviorPatterns.Iterator.samples.Teacher;
import com.bko.BehaviorPatterns.Iterator.study1.MyTeacher;
import com.bko.BehaviorPatterns.Iterator.study3.VeteranTeacher;

/**
 * Created by yo on 4/2/15.
 */
public class IteratorMain {
    public static void main(){

        System.out.println("MyTeacher---\n");
        Teacher you = new MyTeacher();
        you.createStudentList();
        you.callStudents();


        System.out.println("VeteranTeacher---\n");
        Teacher veteran = new VeteranTeacher();
        veteran.createStudentList();
        veteran.callStudents();
    }
}
