package com.bko.generate_patterns.singleton;

/**
 * Created by bko on 4/3/15.
 */
public class RegisterNote {
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote(){}

    private int callee;

    public static RegisterNote getInstance(){
        return registerNote;
    }

    public int isThisShingle(){
        System.out.println(callee);
        callee++;
        return callee;
    }

}