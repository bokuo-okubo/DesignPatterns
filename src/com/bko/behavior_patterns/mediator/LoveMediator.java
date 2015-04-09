package com.bko.behavior_patterns.mediator;

import java.text.CollationElementIterator;

/**
 * Created by bko on 4/9/15.
 */
public interface LoveMediator {
    public void addColleague(Colleague colleague);
    public void consultation(Colleague colleague, Colleague colleague2);
}
