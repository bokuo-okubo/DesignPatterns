package com.bko.structure_patterns.adapter;

/**
 * Created by yo on 4/3/15.
 */
public class Teacher {
    public static void main(){
        Chairperson chairperson = new NewTaro();
        chairperson.organaizeClass();

        Chairperson secondChair = new Hanako();
        secondChair.organaizeClass();
    }
}
