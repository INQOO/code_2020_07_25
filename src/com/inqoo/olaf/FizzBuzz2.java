package com.inqoo.olaf;

import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        // zapytac uzytkownika ile liczb wypisac
        // zapisujecie to do zmiennej
        // wypisujecie od 1 do liczby ktora podal uzytkownik
        // uzywamy petli while
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Odliczanie do podanej liczby: ");
            number = scanner.nextInt();
        }
        System.out.println("Liczba: " + number);
        int counter = 0;

        while(counter <= number){
            System.out.println("Nadal w pętli licznik: " + counter);
            counter ++;
        }
        System.out.println("Koniec pętli !!!");

    }
}
