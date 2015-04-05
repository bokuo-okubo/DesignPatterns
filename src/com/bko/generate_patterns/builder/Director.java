package com.bko.generate_patterns.builder;

/**
 * Created by bko on 4/6/15.
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void constract(){
        builder.addSolvent( 100 );
        builder.addSolute( 40 );
        builder.abandonSolution( 70 );
        builder.addSolvent( 100 );
        builder.addSolute( 15 );
    }
}
