package com.bko.generate_patterns.factory_method;

/**
 * Created by bko on 4/3/15.
 */
public class FactoryMethodMain {
    public static void main() {
        CutPrint imagawa = new ImagawaCutPrint();
        imagawa.createCutPrint();

        CutPrint shimizu = new ShimizuCutPrint();
        shimizu.createCutPrint();

    }
}

