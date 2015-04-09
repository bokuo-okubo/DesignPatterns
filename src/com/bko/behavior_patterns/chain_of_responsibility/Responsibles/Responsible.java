package com.bko.behavior_patterns.chain_of_responsibility.Responsibles;

import com.bko.behavior_patterns.chain_of_responsibility.Level;
import com.bko.behavior_patterns.chain_of_responsibility.Question;

/**
 * Created by bko on 4/9/15.
 */
public abstract class Responsible {
    private Responsible next = null;
    private String responsiblePerson = null;

    public Responsible(String responsiblePerson){
        this.responsiblePerson = responsiblePerson;
    }

    public  Responsible setNext(Responsible next){
        this.next = next;
        return next;
    }

    public void putQuestion(Question question){
        if(beAbleToJudge(question)){
            judge(question);
        }else if(next != null){
            next.putQuestion(question);
        }else{
            System.out.println("誰にも判断できませんでした。やってみなさい。");
        }
    }
    protected abstract boolean beAbleToJudge(Question question);

    protected void print(Object obj){
        System.out.println(obj);
    }

    public void judge(Question question){
        print(question.question +" - level:" + question.level.getLevel());
        print("これは");
        print(this.responsiblePerson + "がやります");
    };

}
