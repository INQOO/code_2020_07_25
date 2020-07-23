package com.inqoo.loops;

public class WeekDaysSwitch {

    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1: System.out.println("Poniedzialek");
            case 2: System.out.println("Wtorek");
            case 3: System.out.println("Sroda");
            case 4: System.out.println("Czwartek");
            case 5: System.out.println("Piatek");
            case 6: System.out.println("Sobota");
            case 7: System.out.println("Niedziela");
            default: throw new IllegalArgumentException("Eee, mamy tylko 7 dni tygodnia!");
        }
    }
}
