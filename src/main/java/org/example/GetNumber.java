package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {

    public static Double getNumber(Scanner input, Integer index) {
        double value = 0;

        try {
            System.out.printf("Enter %dº number: ", index + 1);
            value = input.nextDouble();
        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed.");
            System.out.println(e.getMessage());
            getNumber(input, index);
        }

        return value;
    }
}
