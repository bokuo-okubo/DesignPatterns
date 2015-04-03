package com.bko.behavior_patterns.template_method;

/**
 * Created by bko on 4/3/15.
 */
public class TanakasWoodCutPrint extends WoodCutprint {

    @Override
    public void draw(Cuttable hanzai) {
        System.out.println("drawing his girlfriend on hanzai with pen.");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println("Cutting hanzai very carefly with knife.");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println("print print");
    }
}
