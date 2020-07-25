package com.inqoo.interfaces;

public class Main {
    public static void main(String[] args) {
        // przyklad polimorfizmu - queue i linkedlist
        Computation computation = new Addition();
        computation.printNumber(5);
        System.out.println(computation.compute(3.25, 5.2));
    }
}
