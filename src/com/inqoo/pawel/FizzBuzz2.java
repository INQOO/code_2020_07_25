package com.inqoo.pawel;

import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        System.out.println("Ile liczb wypisać?");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

//        do {
//
//        }
//        while (liczba < 1);
//        {
//            System.out.println("Podaj liczbę większą od ZERA!");
//        }

        int counter = 1;
        while (counter <= liczba) {
            for (int i = 1; i <= liczba; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else System.out.println(i);
                counter++;
            }

        }
    }
}

