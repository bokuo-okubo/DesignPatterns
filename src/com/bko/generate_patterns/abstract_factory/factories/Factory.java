package com.bko.generate_patterns.abstract_factory.factories;

import com.bko.generate_patterns.abstract_factory.Ingredients.Protains.Protain;
import com.bko.generate_patterns.abstract_factory.soups.Soup;

import java.util.List;

/**
 * Created by bko on 4/6/15.
 */
public abstract class Factory {
    public abstract Soup getSoup();
    public abstract Protain getMain();
    public abstract List getVegetables();
    public abstract List getOthorIngeredients();
}
