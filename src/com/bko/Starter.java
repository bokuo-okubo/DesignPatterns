package com.bko;



import com.bko.behavior_patterns.iterator.IteratorMain;
import com.bko.behavior_patterns.template_method.TemplateMethodMain;
import com.bko.generate_patterns.factory_method.FactoryMethodMain;
import com.bko.generate_patterns.proto_type.ProtoTypeMain;
import com.bko.generate_patterns.singleton.SingletonMain;
import com.bko.structure_patterns.adapter.AdapterMain;

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
        map.put("iterator",new Integer(1));
        map.put("adapter", new Integer(2));
        map.put("template", new Integer(3));
        map.put("factory", new Integer(4));
        map.put("singleton", new Integer(5));
        map.put("prototype", new Integer(6));

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
        }
    }
}
