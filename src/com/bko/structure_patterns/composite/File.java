package com.bko.structure_patterns.composite;

/**
 * Created by bko on 4/8/15.
 */
public class File {
    private String name = null;
    public File(String name){
        this.name = name;
    }

    public void remove(){
        System.out.println(name + "を削除しました。");
    }
}
