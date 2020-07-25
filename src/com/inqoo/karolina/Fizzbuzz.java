package com.inqoo.karolina;

public class Fizzbuzz {
    public static void main(String[] args) {

        // wypisze liczby od 1-50
        // jesli liczba jest podzielna przez 3 to wypisac fizz
        // jesli liczba jest podzielba przez 5 to wypisac buzz
        // jesli liczba jest podzielna przez 3 i 5 wypisac fizzbuzz

        int i = 1;

        for (i = 1; i <= 50; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if ((i % 3 == 0)) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }

    }
}

