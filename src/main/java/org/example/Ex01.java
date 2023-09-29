package org.example;

import java.util.Scanner;

public class Ex01 {

    static final String PASSWORD = "pindamonhangaba";

    private static void passwordGetter(Scanner input) {
        try {
            System.out.println("Insert password: ");
            String receivedPassword = input.nextLine();

            if (!receivedPassword.equals(PASSWORD))  throw new Exception("Wrong password! Try again.");
            else System.out.println("Welcome!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            passwordGetter(new Scanner(System.in));
        }
    }

    public static void main(String[] args) {

        passwordGetter(new Scanner(System.in));
    }
}
