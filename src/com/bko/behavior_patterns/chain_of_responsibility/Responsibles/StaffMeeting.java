package com.bko.behavior_patterns.chain_of_responsibility.Responsibles;

import com.bko.behavior_patterns.chain_of_responsibility.Level;
import com.bko.behavior_patterns.chain_of_responsibility.Question;
import com.bko.behavior_patterns.chain_of_responsibility.Responsibles.Responsible;

/**
 * Created by bko on 4/9/15.
 */
public class StaffMeeting extends Responsible {
    private Level level = new Level(5);

    public StaffMeeting(String responsiblePerson) {
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
