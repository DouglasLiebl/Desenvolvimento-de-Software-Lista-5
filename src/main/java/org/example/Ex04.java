package org.example;


import java.sql.PreparedStatement;
import java.util.*;

public class Ex04 {

    private static void getValues(Scanner input) {
        try {
            System.out.print("""
                    Select the desired operation:\s
                    [+] Sum\s
                    [-] Subtraction\s
                    [*] Multiplication\s
                    [/] Division\s
                    Operator:
                    """);
            String operator = input.next();

            System.out.print("Enter first value: ");
            double n1 = input.nextDouble();

            System.out.print("Enter second value: ");
            double n2 = input.nextDouble();

            System.out.printf("Result: %.1f", calculator(operator, n1, n2));

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed.");
            System.out.println(e.getMessage());
        }

    }

   private static Double calculator(String operator, Double n1, Double n2) {

        switch (operator) {
            case "+" -> {
                return n1 + n2;
            }
            case "-" -> {
                return n1 - n2;
            }
            case "*" -> {
                return n1 * n2;
            }
            case "/" -> {
                return n1 / n2;
            }
            default -> {
                return 0.0;
            }
        }

   }

    public static void main(String[] args) {

        getValues(new Scanner(System.in));
    }
}
