package com.inqoo.loops;

import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {
        final List<String> names = List.of("Ewa", "Ola", "Adam", "Maciej", "Marek");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
