package com.bko.structure_patterns.composite.directory_entries;

/**
 * Created by bko on 4/8/15.
 */
public class File implements DirectoryEntry {
    private String name = null;
    public File(String name){
        this.name = name;
    }

    public void remove(){
        System.out.println(name + "を削除しました。");
    }
}
