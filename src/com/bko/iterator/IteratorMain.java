package com.bko.Iterator;

import com.bko.Iterator.samples.Teacher;
import com.bko.Iterator.study1.MyTeacher;
import com.bko.Iterator.study3.VeteranTeacher;
import com.bko.abstracts.ProjectMainTemplate;

/**
 * Created by yo on 4/2/15.
 */
public class IteratorMain extends ProjectMainTemplate {
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
