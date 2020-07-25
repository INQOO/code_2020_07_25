package com.inqoo.loops;

import java.math.BigInteger;

public class ForLoop4 {

    public static void main(String[] args) { //suma kolejnych 100 i
        BigInteger suma = BigInteger.ONE; // tu trzeba dać .ONE a nie zero żeby nie mnożyło przez 0
        //trzeba też dać przez BigInteger a nie int
        for (int i = 1; i<=10 000000; i++) { // trzeba zmienić int i = 1 a nie 0
            // i++ zwieksz i o 1 za każdym razem
            suma = suma.multiply(BigInteger.valueOf(i)); // chcemy zrobić silnię - by mnożyło przez każdą kolejną
            System.out.println(suma);
        }
        System.out.println(suma);
    }
}
