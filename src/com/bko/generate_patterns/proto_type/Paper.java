package com.bko.generate_patterns.proto_type;

/**
 * Created by bko on 4/5/15.
 */
public class Paper implements Cloneable {
    private String name;
    public Paper(){}

    public Paper(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(this.name);
    }

    @Override
    public Cloneable createClone() {
        Paper newPaper = new Paper();
        newPaper.name = this.name;

        return newPaper;
    }
}
