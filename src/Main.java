package com.bko;

import com.bko.samples.*;
import com.bko.study1.MyTeacher;

public class Main{
    public static void main(String args[]){
        Teacher you = new MyTeacher();

        you.createStudentList();
        you.callStudents();
    }
}