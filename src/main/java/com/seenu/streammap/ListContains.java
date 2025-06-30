package com.seenu.streammap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListContains {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(2, 3, 5, 6, 2);
        List<Integer> l2 = List.of(5, 7, 8, 9, 0);

        List<Integer> set = Stream.concat(l1.stream(), l2.stream())
                .collect(Collectors.toList());   // if you want remove duplicates collect the data into toSet()
        System.out.println(set);   // O/P: [2, 3, 5, 6, 2, 5, 7, 8, 9, 0]

        List<Integer> list = l1.stream()
                .filter(l2::contains)
                .collect(Collectors.toList());
        System.out.println(list); // O/P: [5]

    }
}
