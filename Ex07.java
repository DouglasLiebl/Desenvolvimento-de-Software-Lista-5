package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {

    private static void averageCalculator() {
       double[] notes = new double[4];

       for (int i = 0; i < notes.length; i++) {
           notes[i] = GetNumber.getNumber(new Scanner(System.in), i);
       }

       System.out.printf("Average: %.2f",
               Arrays.stream(notes).average().getAsDouble());
    }

    public static void main(String[] args) {
        averageCalculator();
    }
}
