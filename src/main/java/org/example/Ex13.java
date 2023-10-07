package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

    private static void counter() {
        Scanner input = new Scanner(System.in);
        double[] values = new double[5];

        for (int i = 0; i < values.length; i++) {
            values[i] = GetNumber.getNumber(i);
        }

        System.out.println("Enter the number you want to check the occurrence of: ");
        double value = input.nextDouble();

        occurrenceCounter(values, value);
    }

    private static void occurrenceCounter(double[] list, double n) {
        int count = 0;

        if (Arrays.binarySearch(list, n) < 0) System.out.println("The entered number is not present in the vector.");
        else {
            for(double x : list) {
                if (x == n) count += 1;
            }
            System.out.printf("Number of occurrences: %d", count);
        }
    }

    public static void main(String[] args) {
        counter();
    }
}
