package com.inqoo.interfaces;

public class Multiplication implements Computation {
    @Override
    public double compute(double argument1, double argument2) {
        return argument1 * argument2;
    }

    @Override
    public void printPI() {
        System.out.println(Computation.PI);
    }

}
