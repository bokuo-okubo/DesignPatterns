package com.bko.FactoryMethod;

/**
 * Created by bko on 4/3/15.
 */

public abstract class CutPrint{

    protected abstract void draw( Cuttable hanzai );
    protected abstract void cut( Cuttable hanzai );
    protected abstract void print( Cuttable hanzai );
    public void createCutPrint(){
        Wood hanzai = 
        draw( hanzai );
        cut( hanzai );
        print( hanzai );
    }
}

