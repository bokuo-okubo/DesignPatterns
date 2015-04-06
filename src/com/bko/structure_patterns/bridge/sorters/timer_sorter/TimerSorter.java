package com.bko.structure_patterns.bridge.sorters.timer_sorter;

import com.bko.structure_patterns.bridge.sorters.Sorter;

/**
 * Created by bko on 4/6/15.
 */
public abstract class TimerSorter extends Sorter {
        public void timerSorter(Object obj[]){
            long start = System.currentTimeMillis();
            sort(obj);
            long end = System.currentTimeMillis();
            System.out.println("time:"+(end - start));
        }
}
