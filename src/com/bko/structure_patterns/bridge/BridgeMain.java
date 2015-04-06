package com.bko.structure_patterns.bridge;

import com.bko.structure_patterns.bridge.sorters.BubbleSorter;
import com.bko.structure_patterns.bridge.sorters.QuickSorter;
import com.bko.structure_patterns.bridge.sorters.SortImple;
import com.bko.structure_patterns.bridge.sorters.Sorter;
import com.bko.structure_patterns.bridge.sorters.data.SortData;
import com.bko.structure_patterns.bridge.sorters.timer_sorter.TimerSorter;

import java.util.List;

/**
 * Created by bko on 4/6/15.
 */
public class BridgeMain {
    public static void main(){
//        bubbleSorting();
//        quickSorting();
        useBubbleTimer();
        useQuickTimer();
    }

    private static void useBubbleTimer(){
        List data = SortData.getDataArray();
        TimerSorter timerbubble = new TimerSorter( new BubbleSorter() );

        Object[] ary= new Object[data.size()];

        for(int n=0; n < data.size(); n++){
            ary[n] = ((List) data.get(n)).get(1);
        }
        timerbubble.timerSorter(ary);
    }

    private static void useQuickTimer(){
        List data = SortData.getDataArray();
        TimerSorter timerquick = new TimerSorter( new QuickSorter() );

        Object[] ary= new Object[data.size()];

        for(int n=0; n < data.size(); n++){
            ary[n] = ((List) data.get(n)).get(1);
        }
        timerquick.timerSorter(ary);
    }

    private static void bubbleSorting(){
        List data = SortData.getDataArray();
        SortImple bubble = new BubbleSorter();
        Object[] ary= new Object[data.size()];

        for(int n=0; n < data.size(); n++){
            ary[n] = ((List) data.get(n)).get(1);
        }
        bubble.sort(ary);
    }

    private static void quickSorting(){
        List data = SortData.getDataArray();
        SortImple quick = new QuickSorter();
        Object[] ary= new Object[data.size()];
        for(int n=0; n < data.size(); n++){
            ary[n] = ((List) data.get(n)).get(1);
        }
        quick.sort(ary);
    }
}
