package com.bko.FactoryMethod;

import com.bko.TemplateMethod.Cuttable;

/**
 * Created by bko on 4/3/15.
 */
public class ShimizuCutPrint extends CutPrint {
    @Override
    protected void draw(Cuttable hanzai) {
        System.out.println("hogehogehgohoeg");
    }

    @Override
    protected void cut(Cuttable hanzai) {
        System.out.println("foofoofoofoofoo");
    }

    @Override
    protected void print(Cuttable hanzai) {
        System.out.println("pieepieepieepiee");
    }

    @Override
    protected Cuttable createCuttable() {
        return new Prastic();
    }
}
