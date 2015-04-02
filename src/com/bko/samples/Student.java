package com.bko.samples;

public class Student{
    private String name;
    private int sex; //male 1, female 2

    public Student(String name,int sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public int getSex(){
        return sex;
    }
}