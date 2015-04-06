package com.bko.structure_patterns.bridge.sorters;

/**
 * Created by bko on 4/6/15.
 */
public class BubbleSorter extends Sorter {
    @Override
    public void sort(Object[] obj) {
        int[] ints = new int[obj.length];
        for(int n=0; n < obj.length; n++){
            ints[n] = (int)obj[n];
        }
        int[] answer = bubbleSort(ints);
        for(int i=0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    protected int[] bubbleSort(int[] ary){
        //最期の要素を覗いて、全ての要素を並べ変える
        for(int i=0; i<ary.length - 1; i++){
            //下から上に順番に比較
            for(int j= ary.length-1; j > i; j--){
                if(ary[j]<ary[j-1]) {
                    int tmp = ary[j];
                    ary[j] = ary[j - 1];
                    ary[j - 1] = tmp;
                }
            }
        }
        return ary;
    }
}
