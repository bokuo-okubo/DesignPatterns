package com.bko.structure_patterns.bridge.sorters.timer_sorter;

import com.bko.structure_patterns.bridge.sorters.SortImple;
import com.bko.structure_patterns.bridge.sorters.Sorter;

/**
 * Created by bko on 4/6/15.
 */
public class TimerSorter extends Sorter {

    public TimerSorter(SortImple sortImple){
        super(sortImple);
    }

    public void timerSorter(Object obj[]){
        long start = System.currentTimeMillis();
        sort(obj);
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end - start));
    }
}
