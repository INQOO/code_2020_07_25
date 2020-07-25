package com.inqoo.loops;

public class WeekDaysSwitch2 {

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(1));
        System.out.println(getDayOfWeek(3));
        System.out.println(getDayOfWeek(7));
    }

    private static String getDayOfWeek(int day) {
        switch (day) {
            case 1: return "Poniedzialek";
            case 2: return "Wtorek";
            case 3: return "Sroda";
            default: return "Blad";
        }
    }

    private int testowaMetoda() {
        System.out.println("cos wypisuje");
        return 2;
    }
}
