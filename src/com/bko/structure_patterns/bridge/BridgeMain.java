package com.bko.structure_patterns.bridge;

import com.bko.structure_patterns.bridge.sorters.BubbleSorter;
import com.bko.structure_patterns.bridge.sorters.QuickSorter;
import com.bko.structure_patterns.bridge.sorters.Sorter;
import com.bko.structure_patterns.bridge.sorters.data.SortData;

import java.util.List;

/**
 * Created by bko on 4/6/15.
 */
public class BridgeMain {
    public static void main(){
//        bubbleSorting();
        quickSorting();
    }

    private static void bubbleSorting(){
        List data = SortData.getDataArray();
        Sorter bubble = new BubbleSorter();
        Object[] ary= new Object[data.size()];

        for(int n=0; n < data.size(); n++){
            ary[n] = ((List) data.get(n)).get(1);
        }
        bubble.sort(ary);
    }

    private static void quickSorting(){
        List data = SortData.getDataArray();
        Sorter quick = new QuickSorter();
        Object[] ary= new Object[data.size()];
        for(int n=0; n < data.size(); n++){
            ary[n] = ((List) data.get(n)).get(1);
        }
        quick.sort(ary);
    }
}
