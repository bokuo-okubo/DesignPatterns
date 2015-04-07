package com.bko.behavior_patterns.strategy.algorithms;

import com.bko.behavior_patterns.strategy.Human;

/**
 * Created by bko on 4/7/15.
 */
public interface Comparator {
    public int compare(Human h1, Human h2);
}
