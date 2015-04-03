package com.bko.FactoryMethod;

import com.bko.TemplateMethod.Cuttable;
import com.bko.TemplateMethod.Wood;

/**
 * Created by bko on 4/3/15.
 */

public abstract class CutPrint{

    protected abstract void draw( Cuttable hanzai );
    protected abstract void cut( Cuttable hanzai );
    protected abstract void print( Cuttable hanzai );
    protected Cuttable createCuttable(  ){
        return new Wood();
    }

    public void createCutPrint(){
        Cuttable hanzai = createCuttable();
        draw( hanzai );
        cut( hanzai );
        print( hanzai );
    }
}

