package com.inqoo.loops;

public class ForLoop3 {

    public static void main(String[] args) { //suma kolejnych 100 i
        int suma = 0;
        for (int i = 0; i<=100; i++) { //i++ zwieksz i o 1 za każdym razem
            suma +=i;
            System.out.println(suma);
        }
        System.out.println(suma);
    }
}
