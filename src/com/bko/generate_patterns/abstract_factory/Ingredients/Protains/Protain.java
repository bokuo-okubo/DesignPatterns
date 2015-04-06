package com.bko.generate_patterns.abstract_factory.Ingredients.Protains;

import com.bko.generate_patterns.abstract_factory.Ingredients.Ingredient;

/**
 * Created by bko on 4/6/15.
 */
public abstract class Protain extends Ingredient {
    public String name;
    public Protain(){
        this.name = "タンパク質";
    }
}
