package com.bko.TemplateMethod;

import com.bko.abstracts.ProjectMainTemplate;

/**
 * Created by yo on 4/3/15.
 */
public class TemplateMethodMain extends ProjectMainTemplate {
    public static void main(){
        TanakasWoodCutPrint tanaka = new TanakasWoodCutPrint();
        tanaka.createWoodCutPrint();
    }
}
