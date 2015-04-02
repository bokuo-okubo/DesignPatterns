package com.bko.study1;

import com.bko.samples.Teacher;
import com.bko.samples.StudentList;
import com.bko.samples.Student;

/*
spec
student names
赤井亮太　男
赤羽里美　女
岡田美央　女
西森俊介　男
中ノ森玲菜　女

 */
public class MyTeacher extends Teacher{
    protected StudentList studentList;

    @Override
    public void createStudentList() {
        String[] studentsNameList = {
                "赤井亮太",
                "赤羽里美",
                "岡田美央",
                "西森俊介",
                "中ノ森玲菜"
        };

        int[] studentSexList = { 1, 2, 3, 1, 2 };

        if(studentList == null) {
            studentList = new StudentList(studentsNameList.length);
        }

        for(int i = 0; i < studentsNameList.length; i++) {
            Student student = new Student( studentsNameList[i], studentSexList[i] );
            studentList.add( student );
        }

    }

    @Override
    public void callStudents() {
        for(int i = 0; i < studentList.getLastNum(); i++ ){
            System.out.println( studentList.getStudentAt(i).getName() );
        }
    }
}