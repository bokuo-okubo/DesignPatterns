package com.bko.behavior_patterns.iterator.samples;

/**
 * Created by yo on 4/2/15.
 */
public class MyClass {
    static String[] studentsNameList = {
            "赤井亮太",
            "赤羽里美",
            "岡田美央",
            "西森俊介",
            "中ノ森玲菜"
    };

    static int[] studentSexList = { 1, 2, 2, 1, 2 };

    public static String[] getStudentsNameList() {
        return studentsNameList;
    }

    public static int[] getStudentSexList() {
        return studentSexList;
    }
}
