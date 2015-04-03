package com.bko.generate_patterns.singleton;

/**
 * Created by bko on 4/3/15.
 */
public class SingletonMain {
    public static void main(){
        RegisterNote note = RegisterNote.getInstance();
        note.isThisShingle();
        System.out.println(note.getClass());


        RegisterNote note2 = RegisterNote.getInstance();
        note2.isThisShingle();
        System.out.println(note2.getClass());
    }
}
