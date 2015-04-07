package com.bko.behavior_patterns.strategy;

import com.bko.behavior_patterns.strategy.algorithms.Comparator;

/**
 * Created by bko on 4/7/15.
 */
public class MyClass {
    private Comparator comparator = null;

    public MyClass(Comparator comparator){
        this.comparator = comparator;
    }

    public int compare(Human h1, Human h2){
        return comparator.compare(h1, h2);
    }
}
