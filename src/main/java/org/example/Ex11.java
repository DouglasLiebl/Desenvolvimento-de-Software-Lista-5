package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {

    private static Integer indexFinder(double[] array) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to find the index: ");
        double n = input.nextDouble();

         int index = Arrays.binarySearch(array, n);

         return (index < 0) ? -1 : index;
    }


    private static double[] arrayBuilder() {
        double[] list = new double[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = GetNumber.getNumber(i);
        }

        return list;
    }

    public static void main(String[] args) {
        int index = indexFinder(arrayBuilder());

        if (index == -1) System.out.println("The entered number is not present in the vector.");
        else System.out.printf("The index of the number entered is: %d", index);
    }
}
