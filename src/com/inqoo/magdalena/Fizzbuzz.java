package com.inqoo.magdalena;

import java.math.BigInteger;
import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        // wypisze liczby od 1 do 50 tylko
        //jesli liczba jest podzielna przez 3 to zamiast liczby wyisac Fizz
        //jesli liczba jest bodzielna przez 5 wypisać Buzz
        //jesli liczba jest podzielna przez 3 i 5 wypisać FizzBuzz
        /* 1
        2
        Fizz
        4
        Buzz
        ....
        14
        FizzBuzz
        */
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }}