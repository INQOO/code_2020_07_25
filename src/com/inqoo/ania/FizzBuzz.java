package com.inqoo.ania;

public class FizzBuzz {
    public static void main(String[] args) {
        //wypisz liczby 1 do 50

//        for (int i = 1; i <=50; i++) {
//            System.out.println(i);
//        }

        for(int i = 1; i <= 100; i++) {

            //jeśli liczba jest podzielna przez 3 i 5 to wypisać FizzBuzz
            if(i %3 == 0 & i %5 == 0) {
                System.out.println("Fizz Buzz");}

            //jeśli liczba jest podzielna przez 3 to wypisać Fizz
          else if((i %3) == 0) {
                System.out.println("Fizz");
            }

           //jeśli liczba jest podzielna przez 5 to wypisać Buzz
            else if((i %5) == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }
        }
    }
}
