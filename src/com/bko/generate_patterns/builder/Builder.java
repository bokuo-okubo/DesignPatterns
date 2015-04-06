package com.bko.generate_patterns.builder;

/**
 * Created by bko on 4/6/15.
 */
public interface Builder {
    void addSolute(double soluteAmount);
    void addSolvent(double solventAmount);
    void abandonSolution(double solutionAmount);
    Object getResult();
}
