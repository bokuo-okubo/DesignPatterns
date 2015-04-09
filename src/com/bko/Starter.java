package com.bko;



import com.bko.behavior_patterns.chain_of_responsibility.ResponsibilityMain;
import com.bko.behavior_patterns.iterator.IteratorMain;
import com.bko.behavior_patterns.strategy.StrategyMain;
import com.bko.behavior_patterns.template_method.TemplateMethodMain;
import com.bko.generate_patterns.abstract_factory.AbstractFactoryMain;
import com.bko.generate_patterns.builder.BuilderMain;
import com.bko.generate_patterns.factory_method.FactoryMethodMain;
import com.bko.generate_patterns.proto_type.ProtoTypeMain;
import com.bko.generate_patterns.singleton.SingletonMain;
import com.bko.structure_patterns.adapter.AdapterMain;
import com.bko.structure_patterns.bridge.BridgeMain;
import com.bko.structure_patterns.composite.CompositeMain;
import com.bko.structure_patterns.decorator.DecoratorMain;
import com.bko.structure_patterns.facade.FacadeMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

/**
 * Created by yo on 4/2/15.
 */
public class Starter {
    private static final Map<String,Integer> PROJECT_MAP;
    static {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("iterator",new Integer(1) );
        map.put("adapter", new Integer(2) );
        map.put("template", new Integer(3) );
        map.put("factory", new Integer(4) );
        map.put("singleton", new Integer(5) );
        map.put("prototype", new Integer(6) );
        map.put("builder", new Integer(7) );
        map.put("abstract", new Integer(8) );
        map.put("bridge", new Integer(9) );
        map.put("strategy", new Integer(10) );
        map.put("composite", new Integer(11));
        map.put("decorator", new Integer(12));
        map.put("responsibility", new Integer(14));
        map.put("facade", new Integer(15) );

        PROJECT_MAP = Collections.unmodifiableMap(map);
    }

    private static final Integer getProjectNum(String name){
        if( PROJECT_MAP.get(name) != null ) {
            return PROJECT_MAP.get(name);
        }else {
            return 0;
        }
    }

    public static final void startProject(String name){
        int project_num = Starter.getProjectNum(name);

        switch (project_num){
            case 0:
                System.out.println("invalid project name.");
                break;
            case 1:
                IteratorMain.main();
                break;
            case 2:
                AdapterMain.main();
                break;
            case 3:
                TemplateMethodMain.main();
                break;
            case 4:
                FactoryMethodMain.main();
                break;
            case 5:
                SingletonMain.main();
                break;
            case 6:
                ProtoTypeMain.main();
                break;
            case 7:
                BuilderMain.main();
                break;
            case 8:
                AbstractFactoryMain.main();
                break;
            case 9:
                BridgeMain.main();
                break;
            case 10:
                StrategyMain.main();
                break;
            case 11:
                CompositeMain.main();
                break;
            case 12:
                DecoratorMain.main();
                break;
            case 14:
                ResponsibilityMain.main();
                break;
            case 15:
                FacadeMain.main();
                break;
        }
    }
}
