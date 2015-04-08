package com.bko.structure_patterns.composite.directory_entries;

import java.util.*;

/**
 * Created by bko on 4/8/15.
 */
public class Directory implements DirectoryEntry {
    private List<DirectoryEntry> list;
    private String name = null;

    public Directory(String name){
        this.name = name;
        this.list = new ArrayList<DirectoryEntry>();
    }

    public void add(DirectoryEntry entry){
        list.add(entry);
    }

    public void remove(){
        Iterator<DirectoryEntry> itr = list.iterator();
        System.out.println();
        while (itr.hasNext()){
            DirectoryEntry entry = itr.next();
            entry.remove();
        }
        System.out.println(name + "を削除しました");
    }

}
