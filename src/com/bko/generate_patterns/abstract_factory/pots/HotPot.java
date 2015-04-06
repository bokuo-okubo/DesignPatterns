package com.bko.generate_patterns.abstract_factory.pots;

import com.bko.generate_patterns.abstract_factory.Ingredients.Ingredient;
import com.bko.generate_patterns.abstract_factory.Ingredients.Protains.Protain;
import com.bko.generate_patterns.abstract_factory.Ingredients.vegetables.Vegetable;
import com.bko.generate_patterns.abstract_factory.soups.Soup;
import com.sun.tools.javac.util.*;


import java.util.*;
import java.util.List;

/**
 * Created by bko on 4/6/15.
 */
public class HotPot {
    private Pot pot;
    private Soup soup;
    private Protain protein;
    private List vegetables;
    private List otherIngredients;

    public HotPot(Pot pot){
        this.pot = pot;
    }

    public void addSoup(Soup soup){
        this.soup = soup;
    }

    public void addMain(Protain protein){
        this.protein = protein;
    }

    public void addVegetables(List<Vegetable> vegetables){
        this.vegetables = vegetables;
    }

    public void addOtherIngredients(List<Ingredient> otherIngredients){
        this.otherIngredients = otherIngredients;
    }

    public void printPotStatus(){
        List<String> status = new ArrayList<>();
        status.add(this.pot.name);
        status.add(this.soup.name);
        status.add(this.protein.name);

        Iterator veg_itr = vegetables.iterator();
        while(veg_itr.hasNext()){
            Vegetable veg = (Vegetable)veg_itr.next();
            status.add(veg.name);
        }

        Iterator ind_itr = otherIngredients.iterator();
        while(ind_itr.hasNext()){
            Ingredient ind = (Ingredient)ind_itr.next();
            status.add(ind.name);
        }

        System.out.println(status.toString());
    }

}

