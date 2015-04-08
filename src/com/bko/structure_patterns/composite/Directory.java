package com.bko.structure_patterns.composite;

import java.util.*;

/**
 * Created by bko on 4/8/15.
 */
public class Directory {
    private List<Object> list;
    private String name = null;

    public Directory(String name){
        this.name = name;
        this.list = new ArrayList<Object>();
    }

    public void add(File file){
        list.add(file);
    }

    public void add(Directory dir){
        list.add(dir);
    }

    public void remove(){
        Iterator<Object> itr = list.iterator();
        while (itr.hasNext()){
            Object obj = itr.next();
            if(obj instanceof File){
                ((File) obj).remove();
            }else if(obj instanceof Directory){
                ((Directory) obj).remove();
            }else {
                System.out.println("削除できません");
            }
            System.out.println(name + "を削除しました");
        }
    }

}
