package com.bko.structure_patterns.bridge.sorters.data;


import java.util.List;

/**
 * Created by bko on 4/6/15.
 */
public class SortData {
    private static List dataArray;

    public static List getDataArray(){

        dataArray = (List) FileHandler.readFile();

        return dataArray;
    }
}
