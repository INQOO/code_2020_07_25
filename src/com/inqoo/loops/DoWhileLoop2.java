package com.inqoo.loops;

public class DoWhileLoop2 {

    public static void main(String[] args) {
        int counter = 10;

        do {
            System.out.println("Nadal w pętli, licznik: " + counter);
            counter++;
        } while(counter < 10);

        System.out.println("Koniec pętli");
    }
}
