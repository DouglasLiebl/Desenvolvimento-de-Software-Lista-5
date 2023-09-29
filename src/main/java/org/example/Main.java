package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> teste = new ArrayList<>();
        teste.add(1);
        teste.add(5);
        teste.add(3);

        var result = teste.stream().max(Integer::compare).get();

        System.out.println(result);
    }
}