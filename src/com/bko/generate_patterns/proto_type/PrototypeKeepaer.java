package com.bko.generate_patterns.proto_type;

import java.util.*;

/**
 * Created by bko on 4/5/15.
 */
public class PrototypeKeepaer {
    private Map<String, Cloneable> map;

    public PrototypeKeepaer(){
        this.map = new HashMap<String,Cloneable>();
    }

    public void addCloneable(String key, Cloneable prototype){
        map.put( key, prototype);
    }

    public Cloneable getClonne(String key){
        Cloneable prototype = map.get(key);

        return prototype.createClone();
    }

}
