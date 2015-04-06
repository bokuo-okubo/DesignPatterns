package com.bko.generate_patterns.abstract_factory;
import com.bko.generate_patterns.abstract_factory.vegetables.ChineseCabbage;
import com.bko.generate_patterns.abstract_factory.vegetables.Chrysanthemum;
import com.bko.generate_patterns.abstract_factory.vegetables.Leek;

import java.util.*;

/**
 * Created by bko on 4/6/15.
 */
public class SampleClass {
    public static void main(){
        HotPot hotPot = new HotPot(new Pot());
        Factory factory = new MizutakiFactory();

        hotPot.addSoup(factory.getSoup()); // 鶏がらを煮込んだスープ
        hotPot.addMain(factory.getMain);        // Main として鶏肉

        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage()); // 白菜
        vegetables.add(new Leek());           // ねぎ
        vegetables.add(new Chrysanthemum());  // 春菊
        hotPot.addVegetables(vegetables);

        List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
        otherIngredients.add(new Tofu());     // 豆腐
        hotPot.addOtherIngredients(otherIngredients);
    }
}
