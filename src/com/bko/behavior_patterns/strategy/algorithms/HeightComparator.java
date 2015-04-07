package com.bko.behavior_patterns.strategy.algorithms;

import com.bko.behavior_patterns.strategy.Human;

/**
 * Created by bko on 4/7/15.
 */
public class HeightComparator implements Comparator {
    @Override
    public int compare(Human h1, Human h2) {
        if( h1.height > h2.height ){
            return 1;
        }else if(h1.height == h2.height ){
            return 0;
        }else{
            return -1;
        }
    }
}
