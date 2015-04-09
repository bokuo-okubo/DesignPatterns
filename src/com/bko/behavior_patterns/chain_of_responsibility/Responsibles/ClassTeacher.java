package com.bko.behavior_patterns.chain_of_responsibility.Responsibles;

import com.bko.behavior_patterns.chain_of_responsibility.Level;
import com.bko.behavior_patterns.chain_of_responsibility.Question;

/**
 * Created by bko on 4/9/15.
 */
public class ClassTeacher extends Responsible {
    private Level responsibleLevel = new Level(2);

    public ClassTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    @Override
    public Responsible setNext(Responsible next) {
        return super.setNext(next);
    }

    @Override
    protected boolean beAbleToJudge(Question question) {

        if (question.level.lessThan(responsibleLevel)) {
            return true;
        }
        return false;
    }

    @Override
    protected void print(Object obj) {
        super.print(obj);
    }

    @Override
    public void judge(Question question) {
        super.judge(question);
    }
}
