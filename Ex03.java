package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ex03 {

    public static List<Integer> roll() {
        List<Integer> numbers = new ArrayList<>();
        try {
            for(int i = 0; i < 2; i++) {
                int number = new Random().nextInt(7);

                if (number == 0) number += 1;
                numbers.add(number);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return numbers;
    }

    private static void comparator() {
        try {
            List<Integer> num = roll();

            if (num.stream()
                    .mapToInt(n -> n)
                    .sum() != 7) throw new Exception("Isn't seven.");
            else System.out.println("Is seven.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            comparator();
        }
    }

    public static void main(String[] args) {

        comparator();
    }
}
