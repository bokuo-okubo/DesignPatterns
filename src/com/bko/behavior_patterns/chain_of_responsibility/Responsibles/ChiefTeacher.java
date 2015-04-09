package com.bko.behavior_patterns.chain_of_responsibility.Responsibles;

import com.bko.behavior_patterns.chain_of_responsibility.Level;
import com.bko.behavior_patterns.chain_of_responsibility.Question;

/**
 * Created by bko on 4/9/15.
 */
public class ChiefTeacher extends Responsible {
    private Level level = new Level(4);

    public ChiefTeacher(String responsiblePerson) {
        super(responsiblePerson);
    }

    @Override
    public Responsible setNext(Responsible next) {
        return super.setNext(next);
    }

    @Override
    protected boolean beAbleToJudge(Question question) {
        if(question.level.lessThan(level)){
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
