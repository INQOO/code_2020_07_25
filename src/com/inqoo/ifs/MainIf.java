package com.inqoo.ifs;

import java.util.Scanner;

public class MainIf {
    public static void main(String[] args) {
        // tworzymy scanner ktory czyta z wejscia (system.in)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wynik 2+2: ");
        // pobieramy od uzytkownika liczbe (int)
        int number = scanner.nextInt();
        System.out.println("Podales: " + number);

        //jezeli numer = 4
        if (number == 4) {
            System.out.println("Brawo!");
        } else if (number == 3 || number == 5) {
            System.out.println("Jestes blisko!");
        } else {
            System.out.println("Niebrawo, zepsules :/");
        }

    }
}
