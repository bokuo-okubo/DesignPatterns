package com.bko.generate_patterns.abstract_factory;


import com.bko.generate_patterns.abstract_factory.vegetables.ChineseCabbage;
import com.bko.generate_patterns.abstract_factory.vegetables.Chrysanthemum;
import com.bko.generate_patterns.abstract_factory.vegetables.Leek;
import com.bko.generate_patterns.abstract_factory.vegetables.Vegetable;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by bko on 4/6/15.
 */
public class MizutakiFactory extends Factory {
    public Soup getSoup(){
        return new ChickenBoneSoup();
    }

    public Protein getMain(){
        return new Chicken();
    }

    public List<Vegetable> getVegetables(){
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage());
        vegetables.add(new Leek());
        vegetables.add(new Chrysanthemum());
    }


}
