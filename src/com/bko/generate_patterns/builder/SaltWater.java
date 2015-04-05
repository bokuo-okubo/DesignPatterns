package com.bko.generate_patterns.builder;

/**
 * Created by bko on 4/6/15.
 */
public class SaltWater{
    public double salt;
    public double water;
    public SaltWater(double water, double salt){
        this.salt = salt;
        this.water = water;
    }

    public void PrintValue(){
        System.out.println(this.salt);
        System.out.println(this.water);
    }
}


