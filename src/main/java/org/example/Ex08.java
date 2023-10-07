package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ex08 {

    private static void positionFinder() {
        double[] values = new double[5];
        double min = values[0], max = values[0];
        int minInd = 0, maxInd = 0;

        for (int i = 0; i < values.length; i++) {
            values[i] = GetNumber.getNumber(new Scanner(System.in), i);

            if (values[i] > max) {
                max = values[i];
                maxInd = i;
            }

            if (values[i] < min) {
                max = values[i];
                minInd = i;
            }
        }

        System.out.printf("""
                Bigger number index: %d\s
                Smaller number index: %d
                """, maxInd, minInd);
    }

    public static void main(String[] args) {
        positionFinder();
    }
}
