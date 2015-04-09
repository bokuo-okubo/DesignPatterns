package com.bko.behavior_patterns.visitor.homes;

import com.bko.behavior_patterns.visitor.teachers.Teacher;

/**
 * Created by bko on 4/8/15.
 */
public class TanakaHome extends Home implements TeacherAcceptor {
    @Override
    public Object praisedChild() {
        return null;
    }

    @Override
    public Object reprovedChild() {
        return null;
    }

    @Override
    public void accept(Teacher teacher) {

    }
}
