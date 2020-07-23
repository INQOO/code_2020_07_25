package com.inqoo.loops;

import java.util.List;

public class ForLoop {

    public static void main(String[] args) {
        final List<String> names = List.of("Marek", "Ola", "Adam", "Joachim", "Ewa");

        for (
                int i = 1;
                i < names.size();
                i++) {
            System.out.println(names.get(i));
        }
    }
}
