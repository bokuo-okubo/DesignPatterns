package com.bko.behavior_patterns.strategy;

import com.bko.behavior_patterns.strategy.algorithms.AgeComparator;
import com.bko.behavior_patterns.strategy.algorithms.HeightComparator;

/**
 * Created by bko on 4/7/15.
 */
public class StrategyMain {
    public static void main(){
        Human satoshi = new Human("satoshi", 180, 60, 20);
        Human mizuki = new Human("mizuki", 160, 80, 80);

        MyClass ageComp = new MyClass(new AgeComparator());
        int n = ageComp.compare(satoshi, mizuki);
        System.out.println(n);

        MyClass heightComp = new MyClass(new HeightComparator());
        int i = heightComp.compare(satoshi,mizuki);
        System.out.println(i);

    }
}
