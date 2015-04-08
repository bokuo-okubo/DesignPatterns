package com.bko.structure_patterns.decorator.ice_creams;

/**
 * Created by bko on 4/8/15.
 */
public class VanillaIceCream implements IceCream {
    @Override
    public String getName() {
        return "バニラアイスクリーム";
    }

    @Override
    public String howSweet() {
        return "バニラ味";
    }
}
