package com.bko.generate_patterns.abstract_factory;

import com.bko.generate_patterns.abstract_factory.factories.Factory;
import com.bko.generate_patterns.abstract_factory.factories.KimuchiFactory;
import com.bko.generate_patterns.abstract_factory.factories.MizutakiFactory;
import com.bko.generate_patterns.abstract_factory.factories.SukiakiFactory;
import com.bko.generate_patterns.abstract_factory.pots.HotPot;
import com.bko.generate_patterns.abstract_factory.pots.Pot;

import java.util.*;

/**
 * Created by bko on 4/6/15.
 */
public class SampleClass {
    public static void main(){
        Factory mizu_fac = createFactory("mizutaki");
        HotPot pot = useFactory(mizu_fac);

    }

    public static HotPot useFactory(Factory factory){
        HotPot hotPot = new HotPot(new Pot("土鍋"));

        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getMain());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addOtherIngredients(factory.getOthorIngeredients());

        hotPot.printPotStatus();
        return hotPot;
    }

    private static Factory createFactory(String str){
        if("キムチ鍋".equals(str)){
            return new KimuchiFactory();
        }else if("すき焼き".equals(str)){
            return new SukiakiFactory();
        }else{
            return new MizutakiFactory();
        }
    }
}
