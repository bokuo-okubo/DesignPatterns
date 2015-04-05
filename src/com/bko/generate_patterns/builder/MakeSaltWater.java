package com.bko.generate_patterns.builder;

/**
 * Created by bko on 4/6/15.
 */
public class MakeSaltWater {
    public MakeSaltWater(){
        SaltWater saltWater = new SaltWater( 100 , 40 );
        double saltDelta = 70 * (saltWater.salt / (saltWater.salt + saltWater.water));
        double waterDelta = 70 * (saltWater.water / (saltWater.salt + saltWater.water));
        saltWater.salt -= saltDelta;
        saltWater.water -= waterDelta;
        saltWater.water += 100;
        saltWater.salt += 15;
        saltWater.PrintValue();
    }

    public  void useBuilder(){
        Builder builder = new SaltWaterBuilder();
        Director dir = new Director( builder );

        dir.constract();
        SaltWater saltWater = (SaltWater)builder.getResult();
        saltWater.PrintValue();
    }
}
