package com.bko.FactoryMethod;

import com.bko.TemplateMethod.Cuttable;

/**
 * Created by bko on 4/3/15.
 */
public class ImagawaCutPrint extends CutPrint {
    @Override
    protected void draw(Cuttable hanzai) {
        System.out.println("漫画の絵をかく");
    }

    @Override
    protected void cut(Cuttable hanzai) {
        System.out.println("超孤高等を利用して器用に切る");
    }

    @Override
    protected void print(Cuttable hanzai) {
        System.out.println("インクとして自分の血をつかう");
    }

    @Override
    protected Cuttable createCuttable() {
        return new Potato();
    }
}
