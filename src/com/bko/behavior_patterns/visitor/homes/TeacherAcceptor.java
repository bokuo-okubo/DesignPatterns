package com.bko.behavior_patterns.visitor.homes;

import com.bko.behavior_patterns.visitor.teachers.Teacher;

/**
 * Created by bko on 4/8/15.
 */
public interface TeacherAcceptor  {
    public void accept(Teacher teacher);
}
