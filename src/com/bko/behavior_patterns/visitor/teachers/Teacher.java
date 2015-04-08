package com.bko.behavior_patterns.visitor.teachers;

import com.bko.behavior_patterns.visitor.homes.Home;
import com.bko.behavior_patterns.visitor.homes.SuzukiHome;
import com.bko.behavior_patterns.visitor.homes.TanakaHome;

import java.util.*;

/**
 * Created by bko on 4/8/15.
 */
public abstract class Teacher {
    List students = null;
    public abstract void visit(Home studentHome);
    public abstract void visit(TanakaHome studentHome);
    public abstract void visit(SuzukiHome studentHome);

    public List getStudentList(){
        return students;
    }
}
