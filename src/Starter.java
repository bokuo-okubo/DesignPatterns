import com.bko.adapter.AdapterMain;
import com.bko.iterator.IteratorMain;

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
        }
    }
}
