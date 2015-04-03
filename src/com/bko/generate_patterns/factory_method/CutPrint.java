package com.bko.generate_patterns.factory_method;

import com.bko.behavior_patterns.template_method.Cuttable;
import com.bko.behavior_patterns.template_method.Wood;

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

