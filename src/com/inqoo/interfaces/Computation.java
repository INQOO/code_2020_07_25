package com.inqoo.interfaces;

interface Computation {

    double PI = 3.14;

    double compute(double argument1, double argument2);

    default void printNumber(double number) {
        System.out.println(String.format("And the number is...%f", number));
    }
}
