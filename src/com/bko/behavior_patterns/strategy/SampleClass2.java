package com.bko.behavior_patterns.strategy;

/**
 * Created by bko on 4/7/15.
 */

public class SampleClass2{
    private int type = -1;
    public static final int COMPARE_AGE = 1;
    public static final int COMPARE_HEIGHT = 2;
    public static final int COMPARE_WEIGHT = 3;

    public int compare(Human h1,Human h2){
        if(type == COMPARE_AGE){
            if(h1.age > h2.age){
                return 1;
            }else if(h1.age == h2.age){
                return 0;
            }else{
                return -1;
            }
        }else if(type == COMPARE_HEIGHT){
            if(h1.height > h2.height){
                return 1;
            }else if(h1.height == h2.height ){
                return 0;
            }else{
                return -1;
            }
        }
        //・・・・・
        return 0;
    }
}

