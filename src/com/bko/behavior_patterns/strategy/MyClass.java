package com.bko.behavior_patterns.strategy;

/**
 * Created by bko on 4/7/15.
 */
public class MyClass {

    public int compare(Human h1, Human h2){
        return new AgeComparator().compare(h1, h2);
    }
}
