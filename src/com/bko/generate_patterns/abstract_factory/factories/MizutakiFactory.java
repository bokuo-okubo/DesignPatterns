package com.bko.generate_patterns.abstract_factory.factories;


import com.bko.generate_patterns.abstract_factory.Ingredients.Ingredient;
import com.bko.generate_patterns.abstract_factory.Ingredients.Protains.Chicken;
import com.bko.generate_patterns.abstract_factory.Ingredients.Protains.Protain;
import com.bko.generate_patterns.abstract_factory.Ingredients.Tofu;
import com.bko.generate_patterns.abstract_factory.Ingredients.vegetables.ChineseCabbage;
import com.bko.generate_patterns.abstract_factory.Ingredients.vegetables.Chrysanthemum;
import com.bko.generate_patterns.abstract_factory.Ingredients.vegetables.Leek;
import com.bko.generate_patterns.abstract_factory.Ingredients.vegetables.Vegetable;
import com.bko.generate_patterns.abstract_factory.soups.ChickenBoneSoup;
import com.bko.generate_patterns.abstract_factory.soups.Soup;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by bko on 4/6/15.
 */
public class MizutakiFactory extends Factory {
    public Soup getSoup() {
        return new ChickenBoneSoup();
    }

    public Protain getMain(){
        return new Chicken();
    }

    public List<Vegetable> getVegetables(){
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage());
        vegetables.add(new Leek());
        vegetables.add(new Chrysanthemum());
        return vegetables;
    }

    @Override
    public List<Ingredient> getOthorIngeredients() {
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(new Tofu());

        return ingredients;
    }

}
