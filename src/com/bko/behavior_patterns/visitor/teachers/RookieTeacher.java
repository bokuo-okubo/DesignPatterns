package com.bko.behavior_patterns.visitor.teachers;

import com.bko.behavior_patterns.visitor.homes.Home;
import com.bko.behavior_patterns.visitor.homes.SuzukiHome;
import com.bko.behavior_patterns.visitor.homes.TanakaHome;

import java.util.List;

/**
 * Created by bko on 4/8/15.
 */
public class RookieTeacher extends Teacher {
    List students = null;

    public RookieTeacher(List students) {
        this.students = students;
    }

    @Override
    public void visit(Home studentHome) {
        System.out.println("こんにちは");
    }

    @Override
    public void visit(TanakaHome studentHome) {
        studentHome.praisedChild();
    }

    @Override
    public void visit(SuzukiHome studentHome) {
        studentHome.reprovedChild();
    }
}
