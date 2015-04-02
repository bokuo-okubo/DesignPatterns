package com.bko.iterator;

import com.bko.iterator.samples.*;
import com.bko.iterator.study1.MyTeacher;

public class Main{
    public static void main(String args[]){
        Teacher you = new MyTeacher();

        you.createStudentList();
        you.callStudents();
    }
}