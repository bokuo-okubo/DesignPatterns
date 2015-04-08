package com.bko.structure_patterns.decorator;

import com.bko.structure_patterns.decorator.ice_creams.CashewNutsToppingIceCream;
import com.bko.structure_patterns.decorator.ice_creams.GreanTeaIceCream;
import com.bko.structure_patterns.decorator.ice_creams.IceCream;
import com.bko.structure_patterns.decorator.ice_creams.VanillaIceCream;

/**
 * Created by bko on 4/8/15.
 */
public class DecoratorMain {
    public static void main(){
        IceCream vanillaIce = new VanillaIceCream();
        print(vanillaIce.getName());
        print(vanillaIce.howSweet());

        IceCream greantea = new GreanTeaIceCream();
        print(greantea.getName());
        print(greantea.howSweet());

        IceCream cachVanilla = new  CashewNutsToppingIceCream(vanillaIce);
        print(cachVanilla.getName());
        print(cachVanilla.howSweet());
        
    }

    private static void print(String str){
        System.out.println(str);
    }
}
