package com.bko.behavior_patterns.strategy;

/**
 * Created by bko on 4/7/15.
 */
public class SampleClass {
    public int compare(Human h1, Human h2){
        if(h1.age > h2.age){
            return 1;
        }else if(h1.age == h2.age){
            return 0;
        }else{
            return -1;
        }
    }
}
