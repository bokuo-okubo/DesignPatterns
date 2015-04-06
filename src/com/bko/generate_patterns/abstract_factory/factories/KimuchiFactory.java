package com.bko.generate_patterns.abstract_factory.factories;

import com.bko.generate_patterns.abstract_factory.Ingredients.Protains.Protain;
import com.bko.generate_patterns.abstract_factory.soups.Soup;

import java.util.List;

/**
 * Created by bko on 4/6/15.
 */
public class KimuchiFactory extends Factory {
    @Override
    public Soup getSoup() {
        return null;
    }

    @Override
    public Protain getMain() {
        return null;
    }

    @Override
    public List getVegetables() {
        return null;
    }

    @Override
    public List getOthorIngeredients() {
        return null;
    }
}
