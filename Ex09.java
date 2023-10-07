package org.example;

import java.util.List;

public class Ex09 {

    private static void percentage() {
        int count = 0;

        for (int i = 1; i < 25; i++) {
            List<Integer> values = Ex03.roll();

            if(values.get(0) == 6 || values.get(1) == 6)
                if (values.get(0) == 6 && values.get(1) == 6) count += 2;
                else count += 1;
        }

        int percentil = (count * 100) / 50;

        System.out.println("Number output percentage 6: " + percentil + "%");
    }

    public static void main(String[] args) {
        percentage();
    }
}
