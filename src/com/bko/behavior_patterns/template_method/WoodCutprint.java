package com.bko.behavior_patterns.template_method;

/**
 * Created by bko on 4/3/15.
 */
public abstract class WoodCutprint {
    public abstract void draw( Cuttable hanzai );
    public abstract void cut( Cuttable hanzai);
    public abstract void print( Cuttable hanzai );
    public void createWoodCutPrint(){
        Wood hanzai = new Wood(); //Wood クラスは、Cuttableインタフェイスを実装している
        draw( hanzai );
        cut( hanzai );
        print( hanzai );
    }
}
