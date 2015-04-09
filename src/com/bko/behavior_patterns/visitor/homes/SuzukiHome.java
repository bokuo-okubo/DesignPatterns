package com.bko.behavior_patterns.visitor.homes;

import com.bko.behavior_patterns.visitor.teachers.Teacher;
import com.bko.structure_patterns.decorator.ice_creams.VanillaIceCream;

/**
 * Created by bko on 4/8/15.
 */
public class SuzukiHome extends Home implements TeacherAcceptor {
    @Override
    public Object praisedChild() {
        System.out.println("あら、先生ったらご冗談を");
        return new VanillaIceCream();
    }

    @Override
    public Object reprovedChild() {
        System.out.println("ファック");
        return null;
    }

    @Override
    public void accept(Teacher teacher) {
        teacher.visit(this);
    }
}
