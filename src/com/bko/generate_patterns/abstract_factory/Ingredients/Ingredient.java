package com.bko.generate_patterns.abstract_factory.Ingredients;

/**
 * Created by bko on 4/6/15.
 */
public abstract class Ingredient {
    public String name;

    public Ingredient() {
        this.name = this.getClass().toString();
    }
}
