package com.bko.structure_patterns.decorator.ice_creams;

/**
 * Created by bko on 4/8/15.
 */
public class GreanTeaIceCream implements IceCream {
    @Override
    public String getName() {
        return "抹茶アイスクリーム";
    }

    @Override
    public String howSweet() {
        return "抹茶味";
    }
}
