package com.bko.behavior_patterns.chain_of_responsibility;

/**
 * Created by bko on 4/9/15.
 */
public class Question {
    public String question;
    public Level level;

    public Question(String question, Level questionLevel) {
        this.question = question;
        this.level = questionLevel;
    }
}
