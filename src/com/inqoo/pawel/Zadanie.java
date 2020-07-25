package com.inqoo.pawel;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        /*1. wypisz menu:
        zamiana stringa na duze litery
        zamiana stringa na male litery
        usuniecie ze stringa bialych znakow (trim) na poczatku i koncu
        sprawdzi czy podany jest pusty
        wypisze n poczatkowych znakow stringa
          2. switch(wybor_uzytkownika)
            1.... changeToBigLetters() { toUpperCase
            2....
          default "wybrales zle"

          1
          podaj stringa
          olaf
          10 - wybrales zle
         */

        System.out.println("Podaj słowo: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println("Podaj numer operacji od 1 do 5: ");
        int choosenOption = scanner.nextInt();


        switch (choosenOption) {
            case 1:
                System.out.println(word.toUpperCase());
                break;
            case 2:
                System.out.println(word.toLowerCase());
                break;
            case 3:
                System.out.println("'" + word.strip() + "'");
                break;
            case 4:
                boolean correct = word.isBlank();
                if (correct) {
                    System.out.println("Słowo jest puste");
                }
                else {
                        System.out.println("Słowo nie jest puste");
                    }

                break;
            case 5:
                System.out.println("Podaj ile liczb mam wypisać: ");
                int n = scanner.nextInt();
                System.out.println(word.substring(0, n));
                break;
            default:
                System.out.println("Wybrałeś Źle");
        }


    }
}
