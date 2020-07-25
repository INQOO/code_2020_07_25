package com.inqoo.loops;

import java.math.BigInteger;

public class ForLoop2 {
    public static void main(String[] args) {

        BigInteger suma = BigInteger.ONE;

        for (int i = 1; i <= 10000000; i++)  {
            suma = suma.multiply(BigInteger.valueOf(i));
            System.out.println(suma);

        }

    }
}
