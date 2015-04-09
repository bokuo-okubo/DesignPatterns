package com.bko.behavior_patterns.chain_of_responsibility;

/**
 * Created by bko on 4/9/15.
 */
public class Level {
    private int level;

    public Level(int level) {
        this.level = level;
    }

    public boolean lessThan(Level level){
        if( this.level <= level.level ){
            return true;
        }else{
            return false;
        }
    }

    public int getLevel(){
        return this.level;
    }
}
