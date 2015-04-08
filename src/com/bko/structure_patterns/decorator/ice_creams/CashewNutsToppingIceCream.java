package com.bko.structure_patterns.decorator.ice_creams;

/**
 * Created by bko on 4/8/15.
 */
public class CashewNutsToppingIceCream implements IceCream {
    private IceCream ice = null;

    public CashewNutsToppingIceCream(IceCream ice) {
        this.ice = ice;
    }

    @Override
    public String getName() {
        String name = "カシューナッツ";
        name += ice.getName();
        return name;
    }

    @Override
    public String howSweet() {
        return ice.howSweet();
    }
}
