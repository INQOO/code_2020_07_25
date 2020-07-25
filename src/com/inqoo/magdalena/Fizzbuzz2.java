package com.inqoo.magdalena;

import java.util.Scanner;

public class Fizzbuzz2 {
    public static void main(String[] args) {
        /*zapytac uzytkownika ile liczb wypisac
        // zapisujecie to do zmiennej
        // wypisujecie od 1 do liczby ktora podal uzytkownik
        // uzywamy petli while
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb wpisać? ");
        int number = scanner.nextInt();
        System.out.println("Podano: " + number);
                int i = 0;

                while(i < number){
                    i++;

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}