package com.bko.behavior_patterns.strategy;

/**
 * Created by bko on 4/7/15.
 */
public class Human {

    public String name;
    public int height = -1;
    public int weight = -1;
    public int age = -1;


    public Human(String name, int height, int weight, int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}
