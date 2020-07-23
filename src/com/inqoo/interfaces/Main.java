package com.inqoo.interfaces;

public class Main {
    public static void main(String[] args) {
        // przyklad polimorfizmu - queue i linkedlist
        Computation addition = new Addition();
        addition.printNumber(5);
        System.out.println(addition.compute(3.25, 5.2));
    }
}
