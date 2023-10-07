package org.example;

import java.util.Scanner;

public class Ex05 {

    private static void verifier() {
        double[] values = new double[5];
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            values[i] = GetNumber.getNumber(i);

            if ((values[i] % 2) == 0) count += 1;
        }

        System.out.println("Total number of even numbers entered: " + count);
    }

    public static void main(String[] args) {

    }
}
