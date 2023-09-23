package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {

    private static Integer getNumber(Scanner input) {
        int n = 0;
        try {
            System.out.print("Enter a number: ");
            n = input.nextInt();
        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only Integers are accepted.");
            System.out.println(e.getMessage());
        }
        return n;
    }


    private static void decease() {
        try {
            Integer n = getNumber(new Scanner(System.in));

            do {
                System.out.printf("%d \n", n -= 1);
            } while(n > 1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        decease();
    }

}
