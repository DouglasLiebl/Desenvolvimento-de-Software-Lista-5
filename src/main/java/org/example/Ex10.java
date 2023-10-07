package org.example;

import java.util.Arrays;

public class Ex10 {

    private static void distinctVerifier() {
        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = GetNumber.getNumber(i);
        }

        int distinctNumber = (int) Arrays.stream(numbers).distinct().count();

        System.out.printf("Total of distinct numbers: %d", distinctNumber);
    }

    public static void main(String[] args) {
        distinctVerifier();
    }

}
