package com.bko.structure_patterns.bridge.sorters;

/**
 * Created by bko on 4/6/15.
 */
public abstract class Sorter  {
    private SortImple sortImple;
    public Sorter(SortImple sortImple){
        this.sortImple = sortImple;

    }

    public void sort(Object obj[]){
        sortImple.sort(obj);
    }
}
