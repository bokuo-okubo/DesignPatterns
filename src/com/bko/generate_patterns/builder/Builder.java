package com.bko.generate_patterns.builder;

/**
 * Created by bko on 4/6/15.
 */
public interface Builder {
    public void addSolute(double soluteAmount);
    public void addSolvent(double solventAmount);
    public void abandonSolution(double solutionAmount);
    public Object getResult();
}
