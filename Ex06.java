package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

    private static void comparator() {
        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = GetNumber.getNumber(new Scanner(System.in), i);
        }

        double sum = Arrays.stream(numbers).max().orElseThrow() +
                Arrays.stream(numbers).min().orElseThrow();

        System.out.println("Sum of bigger and smaller numbers: " + sum);
    }

    public static void main(String[] args) {
        comparator();
    }
}
