package com.bko.behavior_patterns.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bko on 4/9/15.
 */
public class Saito implements LoveMediator {
    private Map<String, Colleague> colleagueMap = new HashMap<String, Colleague>();
    private String name;

    public Saito() {
        name = "Saito";
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagueMap.put(colleague.getName(),colleague);
    }

    @Override
    public void consultation(Colleague colleagueInLove, Colleague secretLover) {
        int possibility = 0;

        //return possibility;
    }
}
