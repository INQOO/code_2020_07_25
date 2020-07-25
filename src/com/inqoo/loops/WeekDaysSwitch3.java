/*package com.inqoo.loops;

public class WeekDaysSwitch3 {

    public static void main(String[] args) {
        String dzienTygodnia = getDayOfWeek(1);
    }

    public static void main(String[] args) {

    }

    private static String getDayOfWeek(int day) {
        switch (day) {
            case1: return "Poniedziałek";
            case2: return "Wtorek";
            case3: return "Sroda";
            case4: return "Czwartek";
                    }
        printDayOfWeek(1);
        printDayOfWeek(7);
    }
        int day = 3;
        private static void printDayOfWeek(int day){//1. zrobić metode prywatną printDayOfWeek(int day)  <-- tu przenieś switcha
            //metoda nic nie zwraca tylko wypisuje
        switch (day) {
            case 1: System.out.println("Poniedzialek"); break; // samo break
            case 2: {
                System.out.println("Wtorek");// trzeba dodać klamry i break
                break; // można zapisać tak
            }
            case 3: System.out.println("Sroda"); break; // a można samo break
            /*case 4: System.out.println("Czwartek"); break;
            case 5: System.out.println("Piatek"); break;
            case 6: System.out.println("Sobota"); break;
            case 7: System.out.println("Niedziela"); break;*/ /*
            default: throw new IllegalArgumentException("Eee, mamy tylko 7 dni tygodnia!");
        }
    }
}
*/