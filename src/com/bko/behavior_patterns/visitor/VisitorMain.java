package com.bko.behavior_patterns.visitor;

import java.util.*;

import com.bko.behavior_patterns.visitor.homes.Home;
import com.bko.behavior_patterns.visitor.homes.SuzukiHome;
import com.bko.behavior_patterns.visitor.homes.TanakaHome;
import com.bko.behavior_patterns.visitor.teachers.RookieTeacher;
import com.bko.behavior_patterns.visitor.teachers.Teacher;

/**
 * Created by bko on 4/8/15.
 */
public class VisitorMain {
    public static void main(){
        List students = new ArrayList();
        Teacher teacher = new RookieTeacher(students);


        TanakaHome tanakahome = new TanakaHome();
        SuzukiHome suzukihome = new SuzukiHome();

        teacher.visit(suzukihome);
    }
}
