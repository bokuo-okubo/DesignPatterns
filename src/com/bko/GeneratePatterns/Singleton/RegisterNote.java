package com.bko.GeneratePatterns.Singleton;

/**
 * Created by bko on 4/3/15.
 */
public class RegisterNote {
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote(){};

    public static RegisterNote getInstance(){
        return registerNote;
    }

}